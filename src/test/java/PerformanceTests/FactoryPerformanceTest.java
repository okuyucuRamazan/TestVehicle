package PerformanceTests;

<<<<<<< HEAD
import Vehicle.Enums.TruckTypes;
import Vehicle.Factories.Factory;
import Vehicle.TruckType.FireTruck;
=======
import Vehicle.Factory;
import Vehicle.Type.TruckType.FireTruck;
>>>>>>> 871a608db9f30b72fc0c6806ec0bed6edc5a0bf1
import org.junit.Before;
import org.junit.Test;

public class FactoryPerformanceTest {

    private Factory factory;

    @Before
    public void setUp() {
        factory = new Factory();
    }

    @Test
    public void testCreateFireTruckPerformance() {
        long startTime = System.currentTimeMillis();

        // Oluşturulacak araç sayısı
        int numberOfFireTrucks = 1000000;

        for (int i = 1; i <= numberOfFireTrucks; i++) {
<<<<<<< HEAD
            FireTruck fireTruck = new FireTruck(TruckTypes.FIRE_TRUCK.toString(),i, "Red", 2000, 4, 500);
=======
            FireTruck fireTruck = new FireTruck(i, "Red", 2000, 4, 500);
>>>>>>> 871a608db9f30b72fc0c6806ec0bed6edc5a0bf1
            factory.fireTrucks.add(fireTruck);
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Number of Fire Trucks: " + numberOfFireTrucks);
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }
}
