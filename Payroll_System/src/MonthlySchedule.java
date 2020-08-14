import java.util.Date;

public class MonthlySchedule implements PaymentSchedule{

    @Override
    public boolean isPayDate(Date payDate) {
        return true;
    }
}
