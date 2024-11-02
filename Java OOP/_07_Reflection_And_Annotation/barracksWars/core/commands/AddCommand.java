package _07_Reflection_And_Annotation.barracksWars.core.commands;


import _07_Reflection_And_Annotation.barracksWars.core.Inject;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Repository;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Unit;
import _07_Reflection_And_Annotation.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class AddCommand extends Command {

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;


    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = getData()[1];
        Unit unitToAdd = unitFactory.createUnit(unitType);
        repository.addUnit(unitToAdd);
        return unitType + " added!";
    }


}