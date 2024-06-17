package Vehicle;

public class Motorcycle extends Vehicle{
    private double dailyRental = 15.00;
    private double insuranceCost = 0.0002;
    public Motorcycle(String brand, double value) {
        super(brand, value);
    }

    public double getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "dailyRental=" + dailyRental +
                '}';
    }
}
