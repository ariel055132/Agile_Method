import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TestTimeCard {
    TimeCard tc = new TimeCard(new Date(2001,10,31), 8);
    @Test
    public void testTimeCard1(){
        Date date = tc.getDate();
        assertEquals(new Date(2001, 10, 31), date);
    }

    @Test
    public void testTimeCard2(){
        double hour = tc.getHours();
        // delta need to be added to prevent AssertionError
        assertEquals(8.0 , hour, 0.0f);
    }
}
