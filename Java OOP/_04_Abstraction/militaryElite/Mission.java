package _04_Abstraction.militaryElite;

public interface Mission {
    String getCodeName();
    States getState();
    void completeMission();
}