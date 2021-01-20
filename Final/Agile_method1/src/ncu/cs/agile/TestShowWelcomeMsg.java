package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestShowWelcomeMsg {

	@Test
	public void TestShowWelcomeMsg1() throws IOException {
		UI aUI = new UI();
		assertEquals(true,aUI.showWelcomeMsg("962001051")); //���§�
	}
	@Test
	public void TestShowWelcomeMsg2() throws IOException {
		UI aUI = new UI();
		assertEquals(true,aUI.showWelcomeMsg("962001044")); // ��v��
	}
	@Test
	public void TestShowWelcomeMsg3() throws IOException {
		UI aUI = new UI();
		assertEquals(true,aUI.showWelcomeMsg("955002056")); // �\����
	}
	@Test
	public void TestShowWelcomeMsg4() throws IOException {
		UI aUI = new UI();
		assertEquals(true,aUI.showWelcomeMsg("975002039")); //�\�q��
	}
}
