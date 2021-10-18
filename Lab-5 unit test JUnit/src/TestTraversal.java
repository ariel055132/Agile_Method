import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTraversal {
	// Test Inorder, Preorder, Postrorder Traversal with the input given by TA in powerpoint page 10 and assignment 1 respectively.
	// Input1: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
	// Input2: 10, 5, 4, 11, 15, 16, 17, 3, 2, 9, 8, 7
	// Input3: 2, 5, 9, 14, 13, 17, 6
	
	
	@Test
	@DisplayName("PostOrder Traversal with Input1")
	void test() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput1(avlTree);
		assertEquals("0 2 1 4 6 5 3 8 10 9 7", avlTree.postorder());
	}
	
	
	@Test
	@DisplayName("PreOrder Traversal with Input1")
	void test1() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput1(avlTree);
		assertEquals("7 3 1 0 2 5 4 6 9 8 10", avlTree.preorder());
	}
	
	@Test
	@DisplayName("InOrder Traversal with Input1")
	void test2() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput1(avlTree);
		assertEquals("0 1 2 3 4 5 6 7 8 9 10", avlTree.inorder());
	}
	
	@Test
	@DisplayName("PostOrder Traversal with Input2")
	void test3() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput2(avlTree);
		assertEquals("2 4 3 7 8 5 10 15 17 16 11 9", avlTree.postorder());
	}
	
	@Test
	@DisplayName("PreOrder Traversal with Input2")
	void test4() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput2(avlTree);
		assertEquals("9 5 3 2 4 8 7 11 10 16 15 17" , avlTree.preorder());
	}
	
	@Test
	@DisplayName("InOrder Traversal with Input2")
	void test5() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput2(avlTree);
		assertEquals("2 3 4 5 7 8 9 10 11 15 16 17", avlTree.inorder());
	}
	
	@Test
	@DisplayName("PostOrder Traversal with Input3")
	void test6() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput3(avlTree);
		assertEquals("2 6 9 5 17 14 13", avlTree.postorder());
	}
	
	@Test
	@DisplayName("PreOrder Traversal with Input3")
	void test7() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput3(avlTree);
		assertEquals("13 5 2 9 6 14 17", avlTree.preorder());
	}
	
	@Test
	@DisplayName("InOrder Traversal with Input3")
	void test8() {
		AvlTree avlTree = new AvlTree();
		avlTree.insertInput3(avlTree);
		assertEquals("2 5 6 9 13 14 17", avlTree.inorder());
	}
	
}
