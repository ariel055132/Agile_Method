import java.util.Date;

public class SalesReceiptTransaction implements Transaction{
    private Date date;
    private int amount;
    private int empId;

    public SalesReceiptTransaction(Date date, int amount, int empId) {
        this.date = date;
        this.amount = amount;
        this.empId = empId;
    }
    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(empId);
        if (e!=null){
            PaymentClassification pc = e.getPaymentClassification();
            if (pc instanceof CommissionedClassification) {
                CommissionedClassification cc = (CommissionedClassification) pc;
                cc.addSalesReceipt(new SalesReceipt(date));
            }
            else{

            }
        }else{

        }
    }
}
