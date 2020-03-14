package p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		for(int i=0;i<4;i++) {
			try {
				boolean b = c.m(i);
				System.out.print("No error. b is ");
				System.out.println(b ? "true": "false");
			}
			catch(Exceptions1 e1) {
				System.out.print(e1.toString());
				System.out.println("發生異常一");
			}
			/*
			catch(Exceptions2 e2) {
				System.out.print(e2.toString());
				System.out.println("發生異常二");
			}
			*/
		}
	}

}
