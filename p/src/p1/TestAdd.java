package p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	// First Test
	@Test
	public void testAdd1() {
		assertEquals(9, (new C().add(6)));
	}
	
	// Second Test
	@Test
	public void testAdd2() {
		assertEquals(-2, (new C().add(-5)));
	}
	
	// Third Test
	@Test
	public void testAdd3() {
		assertEquals(3, (new C().add(0)));
	}
	
}
