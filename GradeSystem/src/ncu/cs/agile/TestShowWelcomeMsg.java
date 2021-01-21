/************************************************************************
class TestShowWelcomeMsg
assert welcome message equals "Welcome 凌宗廷\r\n" when name equals 凌宗廷
************************************************************************/
package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestShowWelcomeMsg {

	@Test
	public void testshowWelcomeMsg() throws IOException {
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		UI aUI = new UI();
		aUI.showWelcomeMsg("凌宗廷");
		//outContent.flush();
		assertEquals("Welcome 凌宗廷\n輸入指令 1) G 顯示成績 (Grade)\n        2) R 顯示排名 (Rank)\n        3) W 更新配分 (Weight)\n        4) A 新增學生 (Add)\n        5) D 刪減學生 (Delete)\n        6) M 更改分數 (Modify)\n        7) E 離開選單 (Exit)\n\n", outContent.toString());
	}

}
