public class AddHourlyEmployee extends AddEmployeeTransaction{
    private double hourlyRate;

    public AddHourlyEmployee(int empId, String name, String address, double hourlyRate){
        super(empId, name, address); // save the value of parents
        this.hourlyRate = hourlyRate;
    }

    @Override
    public PaymentClassification getClassification() {
        return new HourlyClassification(hourlyRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new HourlySchedule();
    }
}
