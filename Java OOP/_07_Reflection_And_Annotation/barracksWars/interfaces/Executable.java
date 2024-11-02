package _07_Reflection_And_Annotation.barracksWars.interfaces;

import java.lang.reflect.InvocationTargetException;

import jdk.jshell.spi.ExecutionControl;

public interface Executable {

    String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;

}