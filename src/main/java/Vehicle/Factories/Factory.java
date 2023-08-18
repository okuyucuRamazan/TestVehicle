package Vehicle.Factories;

import Vehicle.Enums.TruckTypes;
import Vehicle.TruckType.CraneTruck;
import Vehicle.TruckType.FireTruck;
import Vehicle.TruckType.TowTruck;
import Vehicle.Vehicles.Bus;
import Vehicle.Vehicles.Sedan;
import Vehicle.Vehicles.Suv;
import Vehicle.Vehicles.Truck;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public List<FireTruck> fireTrucks = new ArrayList<>();
    public List<CraneTruck> craneTrucks = new ArrayList<>();
    public List<TowTruck> towTrucks = new ArrayList<>();
    public List<Bus> buses = new ArrayList<>();
    public List<Sedan> sedans = new ArrayList<>();
    public List<Suv> suvs = new ArrayList<>();
    public List<Truck> trucks = new ArrayList<>();

    public void createFireTruck(String type, int chassis, String color, double weight, int numberOfDoors, double waterLitre) {
        FireTruck fireTruck1 = new FireTruck(type, chassis, color, weight, numberOfDoors, waterLitre);
        fireTrucks.add(fireTruck1);
        System.out.println("__________________________________");
    }

    public void createTruck() {

    }

    public void createSUV() {

    }

    public void createSedan() {

    }

    public void createBus() {

    }

    public void createCraneTruck(String type, int chasssis, String color, double weight, int numberOfDoors) {
        CraneTruck craneTruck = new CraneTruck(type, chasssis, color, weight, numberOfDoors);
        craneTrucks.add(craneTruck);
        System.out.println("__________________________________");
    }

    public void createTowTruck(String type, int chasssis, String color, double weight, int numberOfDoors) {
        TowTruck towTruck = new TowTruck(type, chasssis, color, weight, numberOfDoors);
        towTrucks.add(towTruck);
        System.out.println("__________________________________");
    }
}
