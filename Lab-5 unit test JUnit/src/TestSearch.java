import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestSearch {
	// Test SearchFunction with the inputs given by TA in powerpoint page 10 respectively.
	// Input2: 10, 5, 4, 11, 15, 16, 17, 3, 2, 9, 8, 7
	// Input3: 2, 5, 9, 14, 13, 17, 6
	
	@Test
	@DisplayName("Search function with Input2")
	void test() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput2(avlTree);
		assertEquals(false, avlTree.search(6));
		assertEquals(false, avlTree.search(1));
		assertEquals(false, avlTree.search(18));
		assertEquals(true, avlTree.search(10));
	}
	
	@Test
	@DisplayName("Search function with Input3")
	void test1() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput3(avlTree);
		assertEquals(false, avlTree.search(1));
		assertEquals(false, avlTree.search(12));
		assertEquals(false, avlTree.search(18));
		assertEquals(true, avlTree.search(9));
	}

}
