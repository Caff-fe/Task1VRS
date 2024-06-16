package Vehicle;

public class Car extends Vehicle {
    private double insuranceCost = 0.0001;
    private double dailyRental = 20.00;
    private int sercurityRating;

    public Car(String brand, double value, int sercurityRating) {
        super(brand, value);
        this.sercurityRating = sercurityRating;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public double getDailyRental() {
        return dailyRental;
    }

    public int getSecurityRating() {
        return sercurityRating;
    }

    public void setDailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }

    @Override
    public String toString() {
        return "Car{" +
                "insuranceCost=" + insuranceCost +
                ", dailyRental=" + dailyRental +
                ", sercurityRating=" + sercurityRating +
                '}';
    }
}
