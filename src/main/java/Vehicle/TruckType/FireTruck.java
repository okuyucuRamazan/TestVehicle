package Vehicle.TruckType;

import Vehicle.Enums.TruckTypes;
import Vehicle.Vehicles.Truck;

public class FireTruck extends Truck {
    private double waterLitre;

    public double getWaterLitre() {
        return waterLitre;
    }

    public void setWaterLitre(double waterLitre) {
        this.waterLitre = waterLitre;
    }

    public void specialMakeSignal(int chassis) {
        System.out.println("Chassis No: " + chassis + ", I'm Fire Truck and I can make SPECIAL signal");
    }

    public void outTheFire(int chassis) {
        System.out.println("Chassis No: " + chassis + ", I can put out the fire");
    }

    @Override
    public void drive() {
        System.out.println("I'm a Fire Truck so I'm a Vehicle so I can be driven");
    }

    @Override
    public void makeSignal() {
        System.out.println("I'm a Fire Truck so I'm a Vehicle so I can make signal");
    }


    public FireTruck(String type, int chassis, String color, double weight, int numberOfDoors, double waterLitre) {
        this.type=type;
        this.color = color;
        this.weight = weight;
        this.numberOfDoors = numberOfDoors;
        this.chassis = chassis;
        this.waterLitre = waterLitre;
        this.drive();
        this.specialMakeSignal(this.chassis);
        this.outTheFire(this.chassis);
        this.makeSignal();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "FireTruck{" +
                " type=" + type +
                ", chassis=" + chassis +
                ", waterLitre=" + waterLitre +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
