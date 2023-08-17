package UnitTests;

import Vehicle.Type.TruckType.FireTruck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireTruckTest {

    private FireTruck fireTruck;

    @Before
    public void setUp() {
        fireTruck = new FireTruck(1, "Red", 2000, 4, 500);
    }

    @Test
    public void testGetWaterLitre() {
        assertEquals(500, fireTruck.getWaterLitre(), 0.01); // Floating-point precision
    }

    @Test
    public void testToString() {
        String expected = "FireTruck{chassis=1, waterLitre=500.0, color='Red', weight=2000.0, numberOfDoors=4}";
        assertEquals(expected, fireTruck.toString());
    }
}
