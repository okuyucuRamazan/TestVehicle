package Vehicle.TruckType;

import Vehicle.Vehicles.Truck;

public class TowTruck extends Truck {
    public TowTruck(String type, int chassis, String color, double weight, int numberOfDoors) {
        this.type=type;
        this.chassis = chassis;
        this.color = color;
        this.weight = weight;
        this.numberOfDoors = numberOfDoors;
        this.drive();
        this.makeSignal();
        System.out.println(this.toString());
    }

    @Override
    public void drive() {
        System.out.println("I'm a Tow Truck, can be driven");
    }

    @Override
    public void makeSignal() {
        System.out.println("I'm a Tow Truck, can make signal");
    }

    @Override
    public String toString() {
        return "TowTruck{" +
                " type=" + type +
                ", chassis=" + chassis +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }


}
