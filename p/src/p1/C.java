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
	// use addition to solve multiplication problem
	public int times(int c) {
		int sum = 0;
		// positive and zero parameter
		if (c >= 0) {
			for(int i=1;i<=c;i++) {	
				sum = add(sum);  
			}
		}
		// negative parameter
		else if (c < 0) {
			for(int i=1;i<=-c;i++) {
				sum = add(sum);
			}
			sum = -sum;
		}
		return sum;
	}
}
