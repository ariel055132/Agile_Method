/******************************************************************************
class TestPromptCommand
test case 1: 輸入 G
test case 2: 輸入 R
test case 3: 輸入 W
test case 4: 輸入 E
******************************************************************************/
package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestPromptCommand {

	@Test
	public void testPromptCommand1() {
		ByteArrayInputStream inContent = new ByteArrayInputStream("G".getBytes());
		System.setIn(inContent);		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand(); 
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("G", ID);
	}
	@Test
	public void testPromptCommand2() {
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("R".getBytes());
		System.setIn(inContent);		
		
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand();  	
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("R", ID);
	}
	@Test
	public void testPromptCommand3() {
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("W".getBytes());
		System.setIn(inContent);		
		
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand();  	
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("W", ID);
	}
	@Test
	public void testPromptCommand4() {
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("E".getBytes());
		System.setIn(inContent);		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand();  	
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("E", ID);
	}
	
	// Add some test cases 
	@Test
	public void testPromptCommand5() {
		ByteArrayInputStream inContent = new ByteArrayInputStream("A".getBytes());
		System.setIn(inContent);		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand();  	
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("A", ID);
	}
	
	@Test
	public void testPromptCommand6() {
		ByteArrayInputStream inContent = new ByteArrayInputStream("D".getBytes());
		System.setIn(inContent);		
		
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand();  	
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("D", ID);
	}
	
	@Test
	public void testPromptCommand7() {
		ByteArrayInputStream inContent = new ByteArrayInputStream("M".getBytes());
		System.setIn(inContent);			
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		String ID = aUI.promptCommand();  	
		//assertEquals("輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) E 離開選單 (Exit)\n", outContent);
		assertEquals ("M", ID);
	}
}
