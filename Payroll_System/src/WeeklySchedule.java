import java.util.Date;

public class WeeklySchedule implements PaymentSchedule {
    @Override
    public boolean isPayDate(Date payDate) {
        return false;
    }
}
