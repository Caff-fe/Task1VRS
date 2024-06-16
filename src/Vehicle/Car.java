package Vehicle;

public class Car extends Vehicle {
    private double insuranceCost = 0.01;

    public Car(String brand, double value) {
        super(brand, value);
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", value=" + getValue() +
                ", insuranceCost=" + insuranceCost +
                '}';
    }
}
