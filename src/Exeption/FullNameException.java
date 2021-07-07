package Exeption;

import CustomThread.MainRunnable;

public class FullNameException extends RuntimeException {
    final String errorInfo="Full name wrong type";

    public String getErrorInfo() {
        return errorInfo;
    }

    public FullNameException() {
        System.out.println(getErrorInfo());
    }
}
