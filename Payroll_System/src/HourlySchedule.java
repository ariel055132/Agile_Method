import java.util.Date;

public class HourlySchedule implements PaymentSchedule{
    @Override
    public boolean isPayDate(Date payDate) {
        return false;
    }
}
