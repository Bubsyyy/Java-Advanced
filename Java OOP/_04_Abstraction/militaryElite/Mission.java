package _04_Abstraction.militaryElite;

public interface Mission {

    String getCodeName();

    States getState(); // (Enumeration: "inProgress" or "finished"),

    void completeMission();

}