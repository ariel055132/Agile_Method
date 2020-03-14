package p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestC {

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testC1() {
		assertNotNull(new C());
	}
	
	@Test
	public void testC2() {
		assertEquals(3, (new C()).a);
	}

}
