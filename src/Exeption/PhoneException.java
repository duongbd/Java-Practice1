package Exeption;

public class PhoneException extends RuntimeException{
    final String errorInfo="phone wrong type";

    public String getErrorInfo() {
        return errorInfo;
    }
    public PhoneException() {
        System.out.println(getErrorInfo());
    }
}
