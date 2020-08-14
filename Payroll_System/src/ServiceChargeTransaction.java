import java.util.Date;

public class ServiceChargeTransaction implements Transaction{
    private int memberId;
    private Date date;
    private double amount;

    public ServiceChargeTransaction(int memberId, Date date, double amount) {
        this.memberId = memberId;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public void execute() {
        Employee e = PayrollDatabase.getEmployee(memberId);
        if (e != null) {
            Affiliation af = e.getAffiliation();
            if (af instanceof UnionAffiliation) {
                UnionAffiliation uaf = (UnionAffiliation) af;
                uaf.addServiceCharge(new ServiceCharge(date, amount));
            }else{

            }
        } else {

        }
    }
}
