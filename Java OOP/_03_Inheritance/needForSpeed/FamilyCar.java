package _03_Inheritance.needForSpeed;

public class FamilyCar extends Car{
    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
