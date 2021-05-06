import aerospecs.HighDownforcePackage;
import aerospecs.LowDownforcePackage;
import engines.MercedesEngine;
import engines.RedBullEngine;
import tires.HardTire;
import tires.MediumTire;
import tires.SoftTire;

public class Race {

    public static void main(String[] args) {
        F1Car redbullCar = new F1Car("RedBull", new RedBullEngine(), new HighDownforcePackage(), new MediumTire());
        F1Car mercedesCar = new F1Car("Mercedes", new MercedesEngine(), new HighDownforcePackage(), new HardTire());

        System.out.println("Start:");
        redbullCar.printSpecs();
        mercedesCar.printSpecs();

        System.out.println();
        System.out.println("Pitstop:");
        mercedesCar.setTire(new SoftTire());
        mercedesCar.printSpecs();

        System.out.println();
        System.out.println("Pitstop:");
        redbullCar.setTire(new SoftTire());
        redbullCar.printSpecs();

        System.out.println();
        System.out.println("Next Race:");
        redbullCar.setAeroSpec(new LowDownforcePackage());
        redbullCar.setTire(new HardTire());

        mercedesCar.printSpecs();
        redbullCar.printSpecs();

    }

}
