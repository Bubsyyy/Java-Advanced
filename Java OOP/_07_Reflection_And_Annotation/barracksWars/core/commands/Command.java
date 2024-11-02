package _07_Reflection_And_Annotation.barracksWars.core.commands;

import _07_Reflection_And_Annotation.barracksWars.interfaces.Executable;

public abstract class Command implements Executable {

    private String[] data;

    public Command(String[] data) {
        this.data = data;
    }


    public String[] getData() {
        return data;
    }
}