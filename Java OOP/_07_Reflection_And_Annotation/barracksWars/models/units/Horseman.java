package _07_Reflection_And_Annotation.barracksWars.models.units;

public class Horseman extends AbstractUnit {

    private static final int HEALTH = 50;
    private static final int DAMAGE = 10;

    public Horseman() {
        super(HEALTH, DAMAGE);
    }
}
