package _04_Interfaces_And_Abstraction.militaryElite;

public interface Mission {
    String getCodeName();
    States getState();
    void completeMission();
}