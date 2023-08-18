package UnitTests;

import Vehicle.Enums.TruckTypes;
import Vehicle.Factories.Factory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {
    private Factory factory;

    @Before
    public void setUp() {
        factory = new Factory();
    }

    @Test
    public void testCreateFireTruck() {
        for (int i = 0; i < 5; i++) {
            factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 2, "Red", 2000, 5, 350);
        }


        assertEquals(5, factory.fireTrucks.size());

    }
}
