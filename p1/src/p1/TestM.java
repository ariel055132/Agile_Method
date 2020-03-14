package p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestM {
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	// first case, case 0 in C.java --> return true
	@Test
	public void testM0()throws Exceptions1{
		C c = new C();
		boolean b = c.m(0);
		assertEquals(b, true);
	}
	
	// second case, case 1 in C.java --> Exceptions 1
	@Test (expected = Exceptions1.class)
	public void testM1()throws Exceptions1{
		C c = new C();
		boolean b = c.m(1);
	}
	
	
	// third case, case 2 in C.java --> Exceptions 2 (true)
	@Test 
	public void testM2()throws Exceptions1{
		C c = new C();
		boolean b = c.m(2);
		assertEquals(b, true);
	}
	
	
	// fourth case, default case in C.java --> return false
	@Test
	public void testM3()throws Exceptions1{
		C c = new C();
		boolean b = c.m(3);
		assertEquals(b, false);
	}
}
