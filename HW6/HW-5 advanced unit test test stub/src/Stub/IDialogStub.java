package Stub;

import java.util.Random;

import ACCESSCODE.IDialog;

public class IDialogStub implements IDialog{
	
	// 從OoooSmartClock.java�堶惇搘X，IDialog會return time zone.
	@Override
	public int show() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNum = random.nextInt(24);
		return randomNum;
	}

}
