package _04_Interfaces_And_Abstraction.militaryElite;

import java.util.ArrayList;

public interface Engineer {
    void addRepair(Repair repair);
    ArrayList<Repair> getRepairs();
}