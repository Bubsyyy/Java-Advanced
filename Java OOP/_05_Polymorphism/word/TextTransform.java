package _05_Polymorphism.word;

public interface TextTransform {
    void invokeOn(StringBuilder text, int startIndex, int endIndex);
}