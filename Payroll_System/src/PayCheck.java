import java.util.Date;

public class PayCheck {
    private Date payDate;
    private double grossPay;
    private double deductions; // it should be the union payment
    private double netPay;

    public PayCheck(Date payDate) {
        this.payDate = payDate;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public Date getPayDate() {
        return payDate;
    }
}
