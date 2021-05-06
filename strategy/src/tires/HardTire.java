package tires;

public class HardTire implements Tire {

    @Override
    public double getGrip() {
        return 0.7;
    }

    @Override
    public String toString() {
        return "Hard";
    }
}
