package _07_Reflection_And_Annotation.barracksWars.core.commands;

import _07_Reflection_And_Annotation.barracksWars.core.Inject;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Repository;
import _07_Reflection_And_Annotation.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class RetireCommand extends Command {

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = getData()[1];

        repository.removeUnit(unitType);

        return unitType + " retired!";
    }
}
