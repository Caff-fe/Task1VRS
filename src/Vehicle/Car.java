package Vehicle;

public class Car extends Vehicle{
    private double value = 20.00;
    private double insuranceCost = 0.01;
    public Car(String brand, double value) {
        super(brand, value);
    }

    @Override
    public double getValue() {
        return value;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }
}
