package _03_Inheritance.restaurant.bevarages;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {

    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
