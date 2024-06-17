package Vehicle;

public class CargoVan extends Vehicle{
    private double insuranceCost = 0.0003;
    private double dailyRental = 50.00;
    public CargoVan(String brand, double value) {
        super(brand, value);
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public double getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }

    @Override
    public String toString() {
        return "CargoVan{" +
                "insuranceCost=" + insuranceCost +
                ", dailyRental=" + dailyRental +
                '}';
    }
}
