import java.util.Calendar;
import java.util.Date;

// Determine the day of paying salary
public class DateUtil {
    // whether it is Friday of the week
    public static boolean isFriday(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 6) {
            return true;
        } else {
            return false;
        }
    }

}
