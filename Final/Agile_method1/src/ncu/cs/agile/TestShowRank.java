package ncu.cs.agile;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestShowRank {

	@Test
	public void TestShowRank1() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(38,aGS.showRank("962001044"));
	}
	
	@Test
	public void TestShowRank2() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(22,aGS.showRank("962001051"));
	}
	
	@Test
	public void TestShowRank3() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(9,aGS.showRank("955002056"));
	}
	
	@Test
	public void TestShowRank4() throws IOException {
		GradeSystems aGS = new GradeSystems();
		assertEquals(60,aGS.showRank("965002038"));
	}
}
