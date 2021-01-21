package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestDeleteStudent {

	@Test
	public void testDeleteStudent1() throws IOException, IDExceptions3 {
		ByteArrayInputStream inContent = new ByteArrayInputStream("995002901\nyes".getBytes());
		System.setIn(inContent);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGS = new GradeSystems();
		Boolean id = aGS.deleteStudent();
		assertEquals (true, id);
	}
	
	@Test
	public void testDeleteStudent2() throws IOException, IDExceptions3 {
		ByteArrayInputStream inContent = new ByteArrayInputStream("955002056\nno".getBytes());
		System.setIn(inContent);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGS = new GradeSystems();
		Boolean id = aGS.deleteStudent();
		assertEquals (false, id);
	}
}
