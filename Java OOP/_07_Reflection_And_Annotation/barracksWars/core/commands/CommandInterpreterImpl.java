package _07_Reflection_And_Annotation.barracksWars.core.commands;

import _07_Reflection_And_Annotation.barracksWars.core.Inject;
import _07_Reflection_And_Annotation.barracksWars.interfaces.CommandInterpreter;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Executable;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Repository;
import _07_Reflection_And_Annotation.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CommandInterpreterImpl implements CommandInterpreter {

    private static final String UNITS_PACKAGE_NAME =
            "_07_Reflection_And_Annotation.barracksWars.core.commands.";

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InvocationTargetException {
        String className = UNITS_PACKAGE_NAME +
                Character.toUpperCase(commandName.charAt(0)) +
                commandName.substring(1) +
                "Command";

        Class<Command> commandClazz = (Class<Command>) Class.forName(className);

        Constructor<Command> con = commandClazz.getDeclaredConstructor(String[].class);

        Command command = con.newInstance((Object) data);

        Field[] declaredFields = commandClazz.getDeclaredFields();

        Arrays.stream(declaredFields)
                .filter(field -> field.isAnnotationPresent(Inject.class))
                .forEach(field -> {
                    try {
                        injectField(field, this.getClass().getDeclaredFields(), command);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return command;
    }

    private void injectField(Field field, Field[] fieldsToInject, Command command) throws IllegalAccessException {

        Field fieldToInject = Arrays.stream(fieldsToInject)
                .filter(f -> f.getType().equals(field.getType()))
                .findFirst()
                .orElse(null);

        if (null != fieldToInject) {
            field.setAccessible(true);
            field.set(command, fieldToInject.get(this));
        }
    }
}
