package _07_Reflection_And_Annotation.barracksWars.core.factories;


import _07_Reflection_And_Annotation.barracksWars.interfaces.Unit;
import _07_Reflection_And_Annotation.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "reflection_and_annotation.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        String className = UNITS_PACKAGE_NAME + unitType;

        Class unitClass = Class.forName(className);

        Constructor<Unit> con = unitClass.getDeclaredConstructor();

        return con.newInstance();
    }
}