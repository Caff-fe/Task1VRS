package Util;

import Driver.Driver;
import Invoice.Invoice;
import Vehicle.Motorcycle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MotorcyclePresenter {
    public void motorInvoice() {
        Driver driver = new Driver("Mary Johnson", 20, 5);

        Motorcycle motor = new Motorcycle("Triumph TIger Sport 660", 10000.00);

        LocalDate startDate = LocalDate.parse("2024-06-03");
        LocalDate endDate = LocalDate.parse("2024-06-13");
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        int rentalDays = (int) daysBetween;

        LocalDate actualReturnDate = LocalDate.of(2024, 6, 13);
        long actualDays = ChronoUnit.DAYS.between(startDate, actualReturnDate);
        double rentalCostPerDay;
        if (actualDays > 7) {
            motor.setDailyRental(10.00);
            rentalCostPerDay = motor.getDailyRental();
        } else {
            rentalCostPerDay = motor.getDailyRental();
        }
        double insurancePerDay = motor.getValue() * motor.getInsuranceCost();
        double totalInsurance = actualDays * insurancePerDay;

        double totalRent = actualDays * rentalCostPerDay;
        if (actualDays == rentalDays) {
            totalRent = rentalDays * rentalCostPerDay;
            totalInsurance = actualDays * insurancePerDay;
        } else {
            totalRent = (actualDays * rentalCostPerDay) + ((rentalDays - actualDays) * (rentalCostPerDay / 2));
            totalInsurance = (actualDays * insurancePerDay) - (daysBetween - actualDays);
        }

        if (driver.getAge() < 25) {
            totalInsurance = totalInsurance + (totalInsurance * 0.2);
        }
        double totalPayment = totalRent + totalInsurance;
        Invoice invoiceMotorcycle = new Invoice(driver.getName(), actualReturnDate, motor.getBrand(), startDate,
                endDate, (int) daysBetween, actualReturnDate, actualDays, rentalCostPerDay,
                insurancePerDay, totalRent, totalInsurance, totalPayment);

        System.out.println(invoiceMotorcycle);
    }
}
