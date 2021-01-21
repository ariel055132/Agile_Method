/*************************************************************************
class TestUpdatesWeights
assert updateWeights() equals true
*************************************************************************/
package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class TestUpdateWeights {

	@Test
	public void testupdateWeights1() throws IOException, IDExceptions1 {
		ByteArrayInputStream inContent = new ByteArrayInputStream("n20\\n20\\n20\\n20\\n20\\nY".getBytes());
		System.setIn(inContent);	
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		GradeSystems aGS = new GradeSystems();
		Boolean updated = aGS.updateWeights();
		assertEquals (true, updated);
	}

}
