package tires;

public class MediumTire implements Tire {

    @Override
    public double getGrip() {
        return 0.9;
    }

    @Override
    public String toString() {
        return "Medium";
    }

}
