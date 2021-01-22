package Agile;

// Error: ID should not have alphabet
public class IDExceptions1 extends Exception{
    public String getMessage() {
        return "這ID含字母 錯了!";
    }
}
