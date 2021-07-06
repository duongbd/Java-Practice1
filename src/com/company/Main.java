package com.company;

import CustomThread.AddEmployeeRunnable;
import CustomThread.MainRunnable;
import Employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        MainRunnable mainRunnable = new MainRunnable();
        AddEmployeeRunnable addEmployeeRunnable = new AddEmployeeRunnable();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        var future = executorService.submit(mainRunnable);

        while (!MainRunnable.isEndProgram()) {
            if (future.isDone()) {
                if (mainRunnable.getAction().equals("add")) {
                    executorService.submit(addEmployeeRunnable);
                    future = executorService.submit(mainRunnable);
                }
            }
        }
        executorService.shutdown();
    }
}