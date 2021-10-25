package ACCESSCODE;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ACCESSCODE.OoooSmartClock;
import Stub.OoooSmartClockStub;

class ClassUnderTest {
	
	@Test 
	@DisplayName("2021-09-22 12:00:30 --> 2021-09-22 NOON")
	public void test() {
		OoooSmartClock clock = new OoooSmartClockStub("2021-09-22 12:00:30");
		String expected = "2021-09-22 NOON";
		String result = clock.getLocalCurrentTimeStamp();
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("2021-09-22 00:00:30 --> 2021-09-22 MIDNIGHT")
	public void test1() {
		OoooSmartClock clock = new OoooSmartClockStub("2021-09-22 00:00:30");
		String expected = "2021-09-22 MIDNIGHT";
		String result = clock.getLocalCurrentTimeStamp();
		assertEquals(expected, result);
	}
	
    @Test
    @DisplayName("2021-10-10 16:37:08 --> 2021-10-10 DOUBLE-TEN 16:37:08")
    public void test2(){ 
        OoooSmartClock clock = new OoooSmartClockStub("2021-10-10 16:37:08");
        String expected = "2021-10-10 DOUBLE-TEN 16:37:08";
        String result = clock.getLocalCurrentTimeStamp();
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("2021-08-08 16:37:08 --> 2021-08-08 FATHER'S DAY 16:37:08")
    public void test3() {
        OoooSmartClock clock = new OoooSmartClockStub("2021-08-08 16:37:08");
        String expected = "2021-08-08 FATHER'S DAY 16:37:08";
        String result = clock.getLocalCurrentTimeStamp();
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("2021-12-25 16:37:08 --> 2021-08-08 X'MAS 16:37:08")
    public void test4() {
    	OoooSmartClock clock = new OoooSmartClockStub("2021-12-25 16:37:08");
        String expected = "2021-12-25 X'MAS 16:37:08";
        String result = clock.getLocalCurrentTimeStamp();
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("2021-12-25 00:00:00 --> 2021-12-25 X'MAS MIDNIGHT")
    public void test5(){
        OoooSmartClock clock = new OoooSmartClockStub("2021-12-25 00:00:00");
        String expected = "2021-12-25 X'MAS MIDNIGHT";
        String result = clock.getLocalCurrentTimeStamp();
        assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("2021-08-08 12:00:30 --> 2021-08-08 FATHER'S DAY NOON")
    public void test6() {
    	OoooSmartClock clock = new OoooSmartClockStub("2021-08-08 12:00:30");
    	String expected = "2021-08-08 FATHER'S DAY NOON";
    	String result = clock.getLocalCurrentTimeStamp();
    	assertEquals(expected, result);
    }
    
    @Test
    @DisplayName("2021-10-10 12:00:30 --> 2021-10-10 DOUBLE-TEN NOON")
    public void test7() {
    	OoooSmartClock clock = new OoooSmartClockStub("2021-10-10 12:00:30");
    	String expected = "2021-10-10 DOUBLE-TEN NOON";
    	String result = clock.getLocalCurrentTimeStamp();
    	assertEquals(expected, result);
    }
}
