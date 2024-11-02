package _07_Reflection_And_Annotation.barracksWars.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface Repository {

    void addUnit(Unit unit);

    String getStatistics();

    void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}