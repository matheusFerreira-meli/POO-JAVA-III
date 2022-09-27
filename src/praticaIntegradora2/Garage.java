package praticaIntegradora2;

import java.util.List;

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
}
