package _07_Reflection_And_Annotation.barracksWars.models.units;

public class Gunner extends AbstractUnit {

    private static final int HEALTH = 20;
    private static final int DAMAGE = 20;

    public Gunner() {
        super(HEALTH, DAMAGE);
    }
}