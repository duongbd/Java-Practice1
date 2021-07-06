package Exeption;

public class EmailException extends RuntimeException {
    final String errorInfo="email wrong type";

    public String getErrorInfo() {
        return errorInfo;
    }
}
