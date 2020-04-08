package ncu.cs.agile;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPromptCommand {

	@Test
	public void TestPromptCommand1() {
		UI aUI = new UI();
		assertEquals("G (Grade), R (Rank), W (Weight), E (Exit)\r\n", aUI.promptCommand());
	}

}
