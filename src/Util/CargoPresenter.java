package Util;

import Driver.Driver;
import Invoice.Invoice;
import Vehicle.CargoVan;
import Vehicle.Motorcycle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CargoPresenter {
    public void cargoInvoice() {
        Driver driver = new Driver("John Markson", 23, 8);

        CargoVan cargoVan = new CargoVan("Citroen Jumper", 20000.00);

        LocalDate startDate = LocalDate.parse("2024-06-03");
        LocalDate endDate = LocalDate.parse("2024-06-18");
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        int rentalDays = (int) daysBetween;

        LocalDate actualReturnDate = LocalDate.of(2024, 6, 13);
        long actualDays = ChronoUnit.DAYS.between(startDate, actualReturnDate);
        double rentalCostPerDay;
            if (actualDays > 7) {
            cargoVan.setDailyRental(40.00);
            rentalCostPerDay = cargoVan.getDailyRental();
        } else {
            rentalCostPerDay = cargoVan.getDailyRental();
        }
        double insurancePerDay = cargoVan.getValue() * cargoVan.getInsuranceCost();
        double totalInsurance = actualDays * insurancePerDay;

        double totalRent = actualDays * rentalCostPerDay;
            if (actualDays == rentalDays) {
            totalRent = rentalDays * rentalCostPerDay;
            totalInsurance = actualDays * insurancePerDay;
        } else {
            totalRent = (actualDays * rentalCostPerDay) + ((rentalDays - actualDays) * (rentalCostPerDay / 2));
            totalInsurance = (actualDays * insurancePerDay) - (daysBetween - actualDays);
        }
            if (driver.getYearsOfExperience() > 5) {
                totalInsurance = totalInsurance - (totalInsurance * 0.15);
            }
        double totalPayment = totalRent + totalInsurance;
        Invoice cargoInvoice = new Invoice(driver.getName(), actualReturnDate, cargoVan.getBrand(), startDate,
                endDate, (int) daysBetween, actualReturnDate, actualDays, rentalCostPerDay,
                insurancePerDay, totalRent, totalInsurance, totalPayment);

            System.out.println(cargoInvoice);
    }
}
