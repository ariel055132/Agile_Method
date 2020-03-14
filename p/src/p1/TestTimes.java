package p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTimes {
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	// First Test
	@Test
	public void testTimes1() {
		assertEquals(9, new C().times(3));
	}
	
	// Second Test
	@Test
	public void testTimes2() {
		assertEquals(12, new C().times(4));
	}
	
	// Third Test
	@Test
	public void testTimes3() {
		assertEquals(15, new C().times(5));
	}
	
}
