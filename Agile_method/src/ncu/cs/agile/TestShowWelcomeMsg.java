package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShowWelcomeMsg {

	@Test
	public void TestShowWelcomeMsg1() {
		UI aUI = new UI();
		assertEquals(true,aUI.showWelcomeMsg("962001051")); //§õ«Â§Ê
	}
	@Test
	public void TestShowWelcomeMsg2() {
		UI aUI = new UI();
		assertEquals(true,aUI.showWelcomeMsg("962001044")); // ­â©v§Ê
	}

}
