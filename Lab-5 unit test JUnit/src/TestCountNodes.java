import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCountNodes {
	// Test CountNodes function with the input given by TA in powerpoint page 10 and assignment 1 respectively.
	// Input1: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
	// Input2: 10, 5, 4, 11, 15, 16, 17, 3, 2, 9, 8, 7
	// Input3: 2, 5, 9, 14, 13, 17, 6
	
	@Test
	@DisplayName("CountNodes with Input1")
	void test() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput1(avlTree);
		assertEquals(11, avlTree.countNodes());
	}
	
	@Test
	@DisplayName("CountNodes with Input2")
	void test1() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput2(avlTree);
		assertEquals(12, avlTree.countNodes());
	}
	
	@Test
	@DisplayName("CountNodes with Input1")
	void test2() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput3(avlTree);
		assertEquals(7, avlTree.countNodes());
	}

}
