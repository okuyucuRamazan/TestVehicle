package UnitTests;

import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private Vehicle vehicle;

    @Before
    public void setUp() {
        vehicle = new Vehicle();
        vehicle.color = "Blue";
        vehicle.weight = 1500;
        vehicle.numberOfDoors = 4;
        vehicle.chassis = 12345;
    }

    @Test
    public void testColor() {
        assertEquals("Blue", vehicle.color);
    }

    @Test
    public void testWeight() {
        assertEquals(1500, vehicle.weight, 0.01);
    }

    @Test
    public void testNumberOfDoors() {
        assertEquals(4, vehicle.numberOfDoors);
    }

    @Test
    public void testChassis() {
        assertEquals(12345, vehicle.chassis);
    }
}
