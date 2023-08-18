package UnitTests;

<<<<<<< HEAD
import Vehicle.Enums.TruckTypes;
import Vehicle.Factories.Factory;
=======
import Vehicle.Factory;
>>>>>>> 871a608db9f30b72fc0c6806ec0bed6edc5a0bf1
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
<<<<<<< HEAD
        for (int i = 0; i < 5; i++) {
            factory.createFireTruck(TruckTypes.FIRE_TRUCK.toString(), 2, "Red", 2000, 5, 350);
        }

=======
        factory.createFireTruck();
>>>>>>> 871a608db9f30b72fc0c6806ec0bed6edc5a0bf1

        assertEquals(5, factory.fireTrucks.size());

    }
}
