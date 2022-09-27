package praticaIntegradora2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Fiesta", "Ford", 1000);
        Vehicle vehicle2 = new Vehicle("Focus", "Ford", 1200);
        Vehicle vehicle3 = new Vehicle("Explorer", "Ford", 2500);
        Vehicle vehicle4 = new Vehicle("Uno", "Fiat", 500);
        Vehicle vehicle5 = new Vehicle("Cronos", "Fiat", 1000);
        Vehicle vehicle6 = new Vehicle("Torino", "Fiat", 1250);
        Vehicle vehicle7 = new Vehicle("Aveo", "Chevrolet", 1250);
        Vehicle vehicle8 = new Vehicle("Spin", "Chevrolet", 2500);
        Vehicle vehicle9 = new Vehicle("Corola", "Toyota", 1200);
        Vehicle vehicle10 = new Vehicle("Fortuner", "Toyota", 3000);
        Vehicle vehicle11 = new Vehicle("Logan", "Renault", 950);

        List<Vehicle> vehicles =Arrays.asList(vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6, vehicle7, vehicle8, vehicle9, vehicle10, vehicle11);
        Garage garage = new Garage(vehicles);

        // Exercicio 3

        garage.sortByPrice();
        System.out.println(garage.getVehicleList());
    }
}
