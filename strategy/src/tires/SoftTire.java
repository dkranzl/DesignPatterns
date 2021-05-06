package tires;

public class SoftTire implements Tire {

    @Override
    public double getGrip() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Soft";
    }
}
