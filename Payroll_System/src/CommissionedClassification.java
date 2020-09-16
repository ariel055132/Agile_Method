public class CommissionedClassification implements PaymentClassification{

    private double salary;
    private double commissionRate;

    // Constructor
    public CommissionedClassification(double salary, double commissionRate){
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay(PayCheck pc) {
        return 0;
    }
}
