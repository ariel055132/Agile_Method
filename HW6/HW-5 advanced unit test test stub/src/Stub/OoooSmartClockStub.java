package Stub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ACCESSCODE.OoooSmartClock;

public class OoooSmartClockStub extends OoooSmartClock{
	public String testDate;
	public OoooSmartClockStub(String date) {
		super();
		testDate = date;
		SetTestTimeZone();
		SetTestCurrentTimeStamp();
	}
	
	public void SetTestTimeZone() {
		try {
			setUpDialog(new IDialogStub());
			setTimeZone();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void SetTestCurrentTimeStamp() {
		try {
			DateFormat dataformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			setCurrentTime(dataformat.parse(testDate));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
