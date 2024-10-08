package _06_DefiningClasses.cat_lady;

public class StreetExtraordinaire extends Cat {

    private double decibelsOfMeows;

    public StreetExtraordinaire(String name, String type, double decibelsOfMeows) {
        super(name, type);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", super.getType(), super.getName(), this.decibelsOfMeows);
    }
}
