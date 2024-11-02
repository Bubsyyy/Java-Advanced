package _07_Reflection_And_Annotation.barracksWars.core.commands;

import _07_Reflection_And_Annotation.barracksWars.core.Inject;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Repository;
import _07_Reflection_And_Annotation.barracksWars.interfaces.UnitFactory;

public class ReportCommand extends Command {

    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return repository.getStatistics();
    }
}