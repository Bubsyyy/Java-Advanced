package _12_Design_Patterns.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CakeFactory {

    private static final String CAKE_PACKAGE_NAME =
            "_12_Design_Patterns.factory";

    private CakeFactory() {
    }

    public static Cake createCake(String type,
                                  double diameter,
                                  double price,
                                  int pieces) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String className = CAKE_PACKAGE_NAME + type;

        Class unitClass = Class.forName(className);

        Constructor<Cake> con = unitClass.getDeclaredConstructor(double.class,
                double.class,
                int.class);

        return con.newInstance(diameter, price, pieces);
    }
}