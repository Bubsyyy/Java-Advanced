package _05_Polymorphism.word;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public abstract class Command {
    private String text;
    private TextTransform textTransform;

    public Command(String text, TextTransform textTransform){
        this.text = text;
        this.textTransform = textTransform;
    }
    public String getText() {
        return this.text;
    }

    public TextTransform getTextTransform() {
        return this.textTransform;
    }

    public abstract String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;


}