package Vehicle.Vehicles;

import Vehicle.Vehicle;

public class Sedan extends Vehicle {

    public Sedan(String type, int chassis, String color, double weight, int numberOfDoors){

    }

    @Override
    public void drive() {
        System.out.println("I'm a Sedan, can be driven");
    }

    @Override
    public void makeSignal() {
        System.out.println("I'm a Sedan, can make signal");
    }


    @Override
    public String toString() {
        return "Sedan{" +
                "type='" + type + '\'' +
                ", chassis=" + chassis +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
