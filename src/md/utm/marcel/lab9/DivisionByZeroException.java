package md.utm.marcel.lab9;

public class DivisionByZeroException extends Exception {
    protected String message = "Division by 0 is forbidden!";

    public DivisionByZeroException() {
    }
}
