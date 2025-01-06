package _04_Abstraction.militaryElite;


import java.util.Collection;
import java.util.Collections;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private Collection<Mission> missions;

    public CommandoImpl(int id,
                        String firstName,
                        String lastName,
                        double salary,
                        String corps,
                        Collection<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        // TODO check for null missions
        this.missions = missions;
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableCollection(this.missions);
    }
}