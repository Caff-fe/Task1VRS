package Invoice;

import java.time.LocalDate;

public class Invoice {

    //This is initial class structure, subject to change
    private String customerName;
    private LocalDate dateOfInvoice;
    private String rentedVehicle;

    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private int rentalPeriod;

    private LocalDate actualReturnDate;
    private String rentalDays;

    private double rentalCostPerDay;
    private double initialInsurance;
    private double insuranceAdditionPerDay;
    private double insurancePerDay;
    private double totalRent;
    private double totalInsurance;

    private double totalPayment;

    public Invoice(String customerName, LocalDate dateOfInvoice,
                   String rentedVehicle, LocalDate reservationStartDate,
                   LocalDate reservationEndDate, int rentalPeriod, LocalDate actualReturnDate,
                   String rentalDays, double rentalCostPerDay, double initialInsurance,
                   double insuranceAdditionPerDay, double insurancePerDay, double totalRent,
                   double totalInsurance, double totalPayment) {
        this.customerName = customerName;
        this.dateOfInvoice = dateOfInvoice;
        this.rentedVehicle = rentedVehicle;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        this.rentalPeriod = rentalPeriod;
        this.actualReturnDate = actualReturnDate;
        this.rentalDays = rentalDays;
        this.rentalCostPerDay = rentalCostPerDay;
        this.initialInsurance = initialInsurance;
        this.insuranceAdditionPerDay = insuranceAdditionPerDay;
        this.insurancePerDay = insurancePerDay;
        this.totalRent = totalRent;
        this.totalInsurance = totalInsurance;
        this.totalPayment = totalPayment;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDateOfInvoice() {
        return dateOfInvoice;
    }

    public void setDateOfInvoice(LocalDate dateOfInvoice) {
        this.dateOfInvoice = dateOfInvoice;
    }

    public String getRentedVehicle() {
        return rentedVehicle;
    }

    public void setRentedVehicle(String rentedVehicle) {
        this.rentedVehicle = rentedVehicle;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public void setReservationStartDate(LocalDate reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationEndDate(LocalDate reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public LocalDate getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public String getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(String rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getRentalCostPerDay() {
        return rentalCostPerDay;
    }

    public void setRentalCostPerDay(double rentalCostPerDay) {
        this.rentalCostPerDay = rentalCostPerDay;
    }

    public double getInitialInsurance() {
        return initialInsurance;
    }

    public void setInitialInsurance(double initialInsurance) {
        this.initialInsurance = initialInsurance;
    }

    public double getInsuranceAdditionPerDay() {
        return insuranceAdditionPerDay;
    }

    public void setInsuranceAdditionPerDay(double insuranceAdditionPerDay) {
        this.insuranceAdditionPerDay = insuranceAdditionPerDay;
    }

    public double getInsurancePerDay() {
        return insurancePerDay;
    }

    public void setInsurancePerDay(double insurancePerDay) {
        this.insurancePerDay = insurancePerDay;
    }

    public double getTotalRent() {
        return totalRent;
    }

    public void setTotalRent(double totalRent) {
        this.totalRent = totalRent;
    }

    public double getTotalInsurance() {
        return totalInsurance;
    }

    public void setTotalInsurance(double totalInsurance) {
        this.totalInsurance = totalInsurance;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customerName='" + customerName + '\'' +
                ", dateOfInvoice=" + dateOfInvoice +
                ", rentedVehicle='" + rentedVehicle + '\'' +
                ", reservationStartDate=" + reservationStartDate +
                ", reservationEndDate=" + reservationEndDate +
                ", rentalPeriod=" + rentalPeriod +
                ", actualReturnDate=" + actualReturnDate +
                ", rentalDays='" + rentalDays + '\'' +
                ", rentalCostPerDay=" + rentalCostPerDay +
                ", initialInsurance=" + initialInsurance +
                ", insuranceAdditionPerDay=" + insuranceAdditionPerDay +
                ", insurancePerDay=" + insurancePerDay +
                ", totalRent=" + totalRent +
                ", totalInsurance=" + totalInsurance +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
