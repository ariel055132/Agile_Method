package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestContainID {

	@Test
	public void testContainID1() throws IDExceptions3, IOException{
		GradeSystems aGS = new GradeSystems();
		boolean flag = aGS.containID("962001051");
		assertEquals(flag, true);
	}
	
	@Test 
	public void testContainID2() throws IDExceptions3, IOException{
		GradeSystems aGS = new GradeSystems();
		boolean flag = aGS.containID("955002056");
		assertEquals(flag, true);
	}
	
	@Test 
	public void testContainID3() throws IDExceptions3, IOException{
		GradeSystems aGS = new GradeSystems();
		boolean flag = aGS.containID("965002044");
		assertEquals(flag, true);
	}
	
	@Test
	public void testContainID4() throws IDExceptions3, IOException{
		GradeSystems aGS = new GradeSystems();
		boolean flag = aGS.containID("975002021");
		assertEquals(flag, true);
	}
}
