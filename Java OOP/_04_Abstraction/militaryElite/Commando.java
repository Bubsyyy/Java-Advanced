package _04_Abstraction.militaryElite;

import java.util.ArrayList;

public interface Commando {
    void addMission(Mission mission);

    ArrayList<Mission> getMissions();
}