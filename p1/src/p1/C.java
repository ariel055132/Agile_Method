package p1;

// Ex requirements
// 1.When i == 2, return true
// 2.remove Exceptions2

public class C {
	public C() {
		
	}
	public boolean m(int i)throws Exceptions1{
		switch(i) {
		case 0: return true;
		case 1: throw new Exceptions1();
		case 2: return true;
		default: return false;
		}
	}
}
