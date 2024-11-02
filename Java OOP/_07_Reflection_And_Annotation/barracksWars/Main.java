package _07_Reflection_And_Annotation.barracksWars;

import _07_Reflection_And_Annotation.barracksWars.core.Engine;
import _07_Reflection_And_Annotation.barracksWars.core.factories.UnitFactoryImpl;
import _07_Reflection_And_Annotation.barracksWars.data.UnitRepository;
import _07_Reflection_And_Annotation.barracksWars.interfaces.Repository;
import _07_Reflection_And_Annotation.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}