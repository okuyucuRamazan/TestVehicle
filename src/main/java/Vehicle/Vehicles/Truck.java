package Vehicle.Vehicles;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
public Truck(){

}
    public Truck(String type, int chassis, String color, double weight, int numberOfDoors){

    }

    @Override
    public void drive() {
        System.out.println("I'm a Truck, can be driven");
    }

    @Override
    public void makeSignal() {
        System.out.println("I'm a Truck, can make signal");
    }


    @Override
    public String toString() {
        return "Truck{" +
                "type='" + type + '\'' +
                ", chassis=" + chassis +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
