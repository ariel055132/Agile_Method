import java.util.Date;

public class TimeCardTransaction implements Transaction{
    private Date date;
    private double hours;
    private int empId;

    public TimeCardTransaction(Date date, double hours, int empId) {
        this.date = date;
        this.hours = hours;
        this.empId = empId;
    }
    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(empId);
        if (e != null) {
            PaymentClassification pc = e.getPaymentClassification();
            if (pc instanceof HourlyClassification) {
                HourlyClassification hc = (HourlyClassification) pc;
                hc.addTimeCard(new TimeCard(date, hours));
            }
        }
    }
}
