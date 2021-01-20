package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPromptCommand {

	@Test
	public void TestPromptCommand1() {
		UI aUI = new UI();
		//assertEquals("G (Grade), R (Rank), W (Weight), E (Exit)\r\n", aUI.promptCommand());		
		assertEquals("G", aUI.promptCommand());
	}
	
	@Test
	public void TestPromptCommand2() {
		UI aUI = new UI();
		assertEquals("R", aUI.promptCommand());
	}
	
	@Test 
	public void TestPromptCommand3() {
		UI aUI = new UI();
		assertEquals("W", aUI.promptCommand());
	}
	
	@Test
	public void TestPromptCommand4() {
		UI aUI = new UI();
		assertEquals("E", aUI.promptCommand());
	}
}
