package Stub;

import java.util.Random;

import ACCESSCODE.IDialog;

public class IDialogStub implements IDialog{
	
	// �qOoooSmartClock.java�ح��ݥX�AIDialog�|return time zone.
	@Override
	public int show() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNum = random.nextInt(24);
		return randomNum;
	}

}
