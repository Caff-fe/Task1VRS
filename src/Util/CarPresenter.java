package Util;

import Driver.Driver;
import Invoice.Invoice;
import Vehicle.Car;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CarPresenter {
    public void carInvoice() {
        Driver driver = new Driver("John Snow", 30, 5);

        Car car = new Car("Toyota", 15000.00, 4);

        LocalDate startDate = LocalDate.parse("2024-06-03");
        LocalDate endDate = LocalDate.parse("2024-06-13");
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        int rentalDays = 10;

        LocalDate actualReturnDate = LocalDate.of(2024, 6, 13);
        long actualDays = ChronoUnit.DAYS.between(startDate, actualReturnDate);
        double rentalCostPerDay;
        if (actualDays > 7) {
            car.setDailyRental(15.00);
            rentalCostPerDay = car.getDailyRental();
        } else {
            rentalCostPerDay = car.getDailyRental();
        }
        double insurancePerDay = car.getValue() * car.getInsuranceCost();

        double totalRent = actualDays * rentalCostPerDay;
        double totalInsurance = actualDays * insurancePerDay;
        if (car.getSecurityRating() >= 3) {
            totalInsurance = totalInsurance - (totalInsurance * 0.1);
        }
        double totalPayment = totalRent + totalInsurance;
        Invoice invoiceCar = new Invoice(driver.getName(), actualReturnDate, car.getBrand(), startDate,
                endDate, rentalDays, actualReturnDate, actualDays, rentalCostPerDay,
                insurancePerDay, totalRent, totalInsurance, totalPayment);

        System.out.println(invoiceCar);
    }
}
