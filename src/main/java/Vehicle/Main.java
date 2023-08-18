package Vehicle;

<<<<<<< HEAD
import Vehicle.Enums.TruckTypes;
import Vehicle.Factories.Factory;
=======
import Vehicle.Type.TruckType.FireTruck;
>>>>>>> 871a608db9f30b72fc0c6806ec0bed6edc5a0bf1

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
<<<<<<< HEAD
        factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 1, "Blue", 2000, 5, 350);
        factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 2, "Red", 1500, 3, 500);
        factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 3, "Orange", 1250, 4, 750);
        factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 4, "Black", 1000, 3, 800);
        factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 5, "White", 4500, 5, 970);
        factory.createCraneTruck(TruckTypes.CRANE_TRUCK.toString(), 1, "Yellow", 1500, 5);
        factory.createTowTruck(TruckTypes.TOW_TRUCK.toString(), 1, "Blue", 1500, 5);

=======
        factory.createFireTruck();
>>>>>>> 871a608db9f30b72fc0c6806ec0bed6edc5a0bf1
    }
}
