package _04_Abstraction.militaryElite;

public class MissionImpl implements Mission {

    private String codeName;
    private States states;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public States getState() {
        return states;
    }

    @Override
    public void completeMission() {
        this.states = States.finished;
    }

    private void setState(String state) {
        this.states = States.valueOf(state);
    }
}