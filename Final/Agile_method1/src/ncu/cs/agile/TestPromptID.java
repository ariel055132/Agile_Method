package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestPromptID {

	@Test
	public void testPromptID1() {
		/*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);
		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		/* 執行promptID return使用者輸入的字串*/
		UI aUI = new UI();
		String ID = aUI.promptID();  
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals("輸入ID或 Q (結束使用)？", outContent);
		assertEquals ("Q", ID);
	}
	
	@Test
	public void testPromptID2() {
		/*用 setIn 設定console input，使用者輸入的字串 962001044 */
		ByteArrayInputStream inContent = new ByteArrayInputStream("962001044".getBytes());
		System.setIn(inContent);
		/*用 setOut設定console output*/
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		/* 執行promptID return使用者輸入字串*/
		UI aUI = new UI();
		String ID = aUI.promptID();  
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？"*/
		assertEquals("輸入ID或 Q (結束使用)？", outContent);
		assertEquals ("962001044", ID);

	}

}
