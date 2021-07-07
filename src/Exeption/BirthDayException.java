package Exeption;

public class BirthDayException extends RuntimeException {
    final String errorInfo="birthday must type: date/month/year";

    public String getErrorInfo() {
        return errorInfo;
    }

    public BirthDayException() {
        System.out.println(getErrorInfo());
    }
}
