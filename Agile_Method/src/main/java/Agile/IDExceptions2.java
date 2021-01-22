package Agile;

// Error: Length of ID is wrong
public class IDExceptions2 extends Exception{
    public String getMessage() {
        return "這ID長度不對 錯了!";
    }
}
