import aerospecs.AeroSpec;
import engines.Engine;
import tires.Tire;

public class F1Car {

    private final String name;
    private Engine engine;
    private AeroSpec aeroSpec;
    private Tire tire;

    public F1Car(String name, Engine engine, AeroSpec aeroSpec, Tire tire) {
        this.name = name;
        this.engine = engine;
        this.aeroSpec = aeroSpec;
        this.tire = tire;
    }

    public void printSpecs() {
        System.out.println(toString() + " at straight: " + aeroSpec.calcMaxSpeed(engine) + " kph");
        System.out.println(toString() + " at 50m corner: " + aeroSpec.calcCornerSpeed(50, engine, tire) + " kph");
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public AeroSpec getAeroSpec() {
        return aeroSpec;
    }

    public Tire getTire() {
        return tire;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setAeroSpec(AeroSpec aeroSpec) {
        this.aeroSpec = aeroSpec;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "[" + name + "][" + tire + "]";
    }
}
