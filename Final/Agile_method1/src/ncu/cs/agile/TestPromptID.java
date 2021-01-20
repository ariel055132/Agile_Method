package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestPromptID {

	@Test
	public void testPromptID1() {
		/*�� setIn �]�wconsole input ��inContent�A�ϥΪ̿�J���r��Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);
		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		/* ����promptID return�ϥΪ̿�J���r��*/
		UI aUI = new UI();
		String ID = aUI.promptID();  
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("��JID�� Q (�����ϥ�)�H", outContent);
		assertEquals ("Q", ID);
	}
	
	@Test
	public void testPromptID2() {
		/*�� setIn �]�wconsole input�A�ϥΪ̿�J���r�� 962001044 */
		ByteArrayInputStream inContent = new ByteArrayInputStream("962001044".getBytes());
		System.setIn(inContent);
		/*�� setOut�]�wconsole output*/
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		/* ����promptID return�ϥΪ̿�J�r��*/
		UI aUI = new UI();
		String ID = aUI.promptID();  
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H"*/
		assertEquals("��JID�� Q (�����ϥ�)�H", outContent);
		assertEquals ("962001044", ID);

	}

}
