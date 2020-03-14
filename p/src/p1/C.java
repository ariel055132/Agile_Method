package p1;

public class C {
	int a = 3;
	public C() {
		
	}
	// add method written in the word document
	// time-complexity: O(1)
	public int add(int b) {
		return (this.a+b);
	}
	public int times(int c) {
		int sum = 0;
		// use addition to solve multiplication problem
		for(int i=1;i<=c;i++) {	
			sum += this.a;  
		}
		return sum;
	}
}
