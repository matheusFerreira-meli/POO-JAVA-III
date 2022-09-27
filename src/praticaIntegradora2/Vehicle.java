package praticaIntegradora2;

public class Vehicle {
    private String model;
    private String brand;
    private double price;

    public Vehicle(String model, String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
