package UnitTests;

import Vehicle.Factory;
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
        factory.createFireTruck();

        assertEquals(5, factory.fireTrucks.size());

    }
}
