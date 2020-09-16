import java.util.Date;

public class BiweeklySchedule implements PaymentSchedule{
    @Override
    public boolean isPayDate(Date payDate) {
        return false;
    }
}
