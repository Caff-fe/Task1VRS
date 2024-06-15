package Vehicle;

public abstract class Vehicle {
    private String brand;
    private double value;

    public Vehicle(String brand, double value) {
        this.brand = brand;
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", value=" + value +
                '}';
    }
}
