package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestModifyGrade {

	@Test
	public void testModifyGrade1() throws IOException {
		ByteArrayInputStream inContent = new ByteArrayInputStream("995002901\nyes\n90\nno\nno\nno\nno\nyes".getBytes());
		System.setIn(inContent);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGS = new GradeSystems();
		Boolean added = aGS.modifyGrade();
		assertEquals (true, added);
	}

}
