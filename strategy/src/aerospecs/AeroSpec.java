package aerospecs;

import engines.Engine;
import tires.Tire;

public interface AeroSpec {

    double calcMaxSpeed(Engine engine);

    double calcCornerSpeed(double radius, Engine engine, Tire tire);

}
