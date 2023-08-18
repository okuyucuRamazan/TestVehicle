package Vehicle;

import Vehicle.Type.TruckType.FireTruck;


import java.util.ArrayList;
import java.util.List;


public class Factory {

   public List<FireTruck> fireTrucks = new ArrayList<>();


    public void createFireTruck() {
//        int piece

        FireTruck fireTruck1 = new FireTruck(1, "Blue", 1500, 5, 250);
        fireTruck1.drive();
        fireTruck1.specialMakeSignal(fireTruck1.chassis);
        fireTruck1.outTheFire(fireTruck1.chassis);
        fireTruck1.makeSignal();
        System.out.println(fireTruck1.toString());
        fireTrucks.add(fireTruck1);
        System.out.println("__________________________________");

        FireTruck fireTruck2 = new FireTruck(2, "Red", 2000, 5, 350);
        fireTruck2.drive();
        fireTruck2.specialMakeSignal(fireTruck2.chassis);
        fireTruck2.outTheFire(fireTruck2.chassis);
        fireTruck2.makeSignal();
        System.out.println(fireTruck2.toString());
        fireTrucks.add(fireTruck2);
        System.out.println("__________________________________");

        FireTruck fireTruck3 = new FireTruck(3, "Brown", 1350, 3, 185);
        fireTruck3.drive();
        fireTruck3.specialMakeSignal(fireTruck3.chassis);
        fireTruck3.outTheFire(fireTruck3.chassis);
        fireTruck3.makeSignal();
        System.out.println(fireTruck3.toString());
        fireTrucks.add(fireTruck3);
        System.out.println("__________________________________");

        FireTruck fireTruck4 = new FireTruck(4, "Orange", 4120, 6, 140);
        fireTruck4.drive();
        fireTruck4.specialMakeSignal(fireTruck4.chassis);
        fireTruck4.outTheFire(fireTruck4.chassis);
        fireTruck4.makeSignal();
        System.out.println(fireTruck4.toString());
        fireTrucks.add(fireTruck4);
        System.out.println("__________________________________");

        FireTruck fireTruck5 = new FireTruck(5, "Yellow", 1500, 5, 250);
        fireTruck5.drive();
        fireTruck5.specialMakeSignal(fireTruck5.chassis);
        fireTruck5.outTheFire(fireTruck5.chassis);
        fireTruck5.makeSignal();
        System.out.println(fireTruck5.toString());
        fireTrucks.add(fireTruck5);
        System.out.println("__________________________________");

    }
}
