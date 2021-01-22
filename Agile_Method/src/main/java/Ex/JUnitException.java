package Ex;

public class JUnitException {
    public static void main(String[] args) {
        JUnitExceptionClass jUnitExceptionClass = new JUnitExceptionClass();
        for (int i = 0; i < 4; i++) {
            try {
                boolean error_no = jUnitExceptionClass.m(i);
                System.out.print("No error. error number is ");
                System.out.println(error_no ? "true" : "false");
            } catch (Exceptions1 error1) {
                System.out.print(error1.toString() + " ");
                System.out.println("Error 1 happens");
            } catch (Exceptions2 error2) {
                System.out.print(error2.toString() + " ");
                System.out.println("Error 2 happens");
            }
        }
    }
}
