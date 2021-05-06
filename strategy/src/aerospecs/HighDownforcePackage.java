package aerospecs;

import engines.Engine;
import tires.Tire;

public class HighDownforcePackage implements AeroSpec {

    @Override
    public double calcMaxSpeed(Engine engine) {
        return engine.getHorsePower() / 3.5;
    }

    @Override
    public double calcCornerSpeed(double radius, Engine engine, Tire tire) {
        return 900 * (((double) engine.getHorsePower() / engine.getWeight()) * (1.0 / radius)) * tire.getGrip();
    }

}
