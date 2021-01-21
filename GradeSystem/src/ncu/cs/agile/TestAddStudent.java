package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestAddStudent {

	@Test
	public void testAddStudent1() throws IOException {
		ByteArrayInputStream inContent = new ByteArrayInputStream("995002904\n張一二\n90\n70\n80\n60\n50\nyes".getBytes());
		System.setIn(inContent);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGS = new GradeSystems();
		Boolean added = aGS.addStudent();
		assertEquals (true, added);
	}
	
	@Test
	public void testAddStudent2() throws IOException {
		ByteArrayInputStream inContent = new ByteArrayInputStream("995002904\n張一二\n90\n70\n80\n60\n50\nno".getBytes());
		System.setIn(inContent);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGS = new GradeSystems();
		Boolean added = aGS.addStudent();
		assertEquals (false, added);
	}
}
