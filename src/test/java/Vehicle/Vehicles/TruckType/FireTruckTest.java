package Vehicle.Vehicles.TruckType;

import Vehicle.Enums.TruckTypes;
import Vehicle.TruckType.FireTruck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireTruckTest {

    private FireTruck fireTruck;

    @Before
    public void setUp() {
        fireTruck = new FireTruck(TruckTypes.FIRE_TRUCK.toString(),1, "Red", 2000, 4, 500);
    }

    @Test
    public void testGetWaterLitre() {
        assertEquals(500, fireTruck.getWaterLitre(), 0.01);
    }

    @Test
    public void testToString() {
        String expected = "FireTruck{ type=FIRE_TRUCK, chassis=1, waterLitre=500.0, color='Red', weight=2000.0, numberOfDoors=4}";
        assertEquals(expected, fireTruck.toString());
    }
}
