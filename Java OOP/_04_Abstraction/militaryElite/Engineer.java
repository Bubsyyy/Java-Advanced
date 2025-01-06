package _04_Abstraction.militaryElite;


import java.util.Collection;

public interface Engineer {

    void addRepair(Repair repair);

    Collection<Repair> getRepairs();

}