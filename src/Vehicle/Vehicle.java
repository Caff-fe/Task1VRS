package Vehicle;

public class Vehicle {
    private String brand;
    private double value;
    private String model;

    public Vehicle(String brand, double value, String model) {
        this.brand = brand;
        this.value = value;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public double getValue() {
        return value;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", value=" + value +
                ", model='" + model + '\'' +
                '}';
    }
}
