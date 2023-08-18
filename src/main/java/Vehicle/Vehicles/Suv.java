package Vehicle.Vehicles;

import Vehicle.Vehicle;

public class Suv extends Vehicle {


    public Suv(String type, int chassis, String color, double weight, int numberOfDoors){

    }

    @Override
    public void drive() {
        System.out.println("I'm a SUV, can be driven");
    }

    @Override
    public void makeSignal() {
        System.out.println("I'm a SUV, can make signal");
    }


    @Override
    public String toString() {
        return "SUV{" +
                "type='" + type + '\'' +
                ", chassis=" + chassis +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
