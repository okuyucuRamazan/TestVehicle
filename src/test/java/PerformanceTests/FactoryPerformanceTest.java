package PerformanceTests;

import Vehicle.Factory;
import Vehicle.Type.TruckType.FireTruck;
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
            FireTruck fireTruck = new FireTruck(i, "Red", 2000, 4, 500);
            factory.fireTrucks.add(fireTruck);
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Number of Fire Trucks: " + numberOfFireTrucks);
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }
}
