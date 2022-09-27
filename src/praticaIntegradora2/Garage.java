package praticaIntegradora2;

import java.util.*;

public class Garage {
    private int id;
    private final List<Vehicle> vehicleList;

    public Garage(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showAverage() {
        OptionalDouble averagePrice = vehicleList.stream()
                .mapToDouble(Vehicle::getPrice)
                .average();

        System.out.println("Média de preços dos veículos: " + averagePrice);
    }

    public void showPriceHigherThan(double price) {
        vehicleList.stream()
                .filter(vehicle -> vehicle.getPrice() >= price)
                .forEach(System.out::println);
    }

    public void showPriceLessThan(double price) {
        vehicleList.stream()
                .filter(vehicle -> vehicle.getPrice() < price)
                .forEach(System.out::println);
    }

    public void showVehiclesOrderedByModel() {
        vehicleList.stream()
                .sorted(Vehicle::compareByModel)
                .forEach(System.out::println);
    }

    public void showVehiclesOrderedByBrand() {
        vehicleList.stream()
                .sorted(Vehicle::compareByBrand)
                .forEach(System.out::println);
    }

    public void showVehiclesOrderedByPrice() {
        vehicleList.stream()
                .sorted(Vehicle::compareByPrice)
                .forEach(System.out::println);
    }
}
