package Vehicle.Vehicles.TruckType;

import Vehicle.Enums.TruckTypes;
import Vehicle.TruckType.CraneTruck;
import Vehicle.TruckType.FireTruck;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CraneTruckTest {

    private CraneTruck craneTruck;

    @Before
    public void setUp() {
        craneTruck = new CraneTruck(TruckTypes.CRANE_TRUCK.toString(),1, "Red", 2000, 4);
    }

    @Test
    public void testToString() {
        String expected = "CraneTruck{type=CRANE_TRUCK, chassis=1, color='Red', weight=2000.0, numberOfDoors=4}";
        assertEquals(expected, craneTruck.toString());
    }
}