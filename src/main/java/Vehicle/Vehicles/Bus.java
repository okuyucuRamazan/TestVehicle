package Vehicle.Vehicles;

import Vehicle.Vehicle;

public class Bus extends Vehicle {
    public Bus(String type, int chassis, String color, double weight, int numberOfDoors){

    }

    @Override
    public void drive() {
        System.out.println("I'm a Bus, can be driven");
    }

    @Override
    public void makeSignal() {
        System.out.println("I'm a Bus, can make signal");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "type='" + type + '\'' +
                ", chassis=" + chassis +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
