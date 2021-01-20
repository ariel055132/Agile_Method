package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestShowFinishMsg {

	@Test
	public void testShowFinishMsg() {
		 final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 System.setOut (new PrintStream (outContent));
		 UI aUI = new UI();
		 aUI.showFinishMsg();
		 //assertEquals("結束了\r\n", outContent);
		 assertEquals("結束了\r\n", outContent.toString());
	}

}
