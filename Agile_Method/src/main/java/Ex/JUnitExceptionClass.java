package Ex;

public class JUnitExceptionClass {
    public JUnitExceptionClass() {}

    public boolean m (int i) throws Exceptions1, Exceptions2 {
        switch(i) {
            case 0: return true;
            case 1: throw new Exceptions1();
            case 2: throw new Exceptions2();
            default: return false;
        }
    }
}
