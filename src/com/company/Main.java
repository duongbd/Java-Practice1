package com.company;

import CustomThread.*;
import Employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        MainRunnable mainRunnable = new MainRunnable();
        AddEmployeeRunnable addEmployeeRunnable = new AddEmployeeRunnable();
        ShowListEmployee showListEmployee = new ShowListEmployee();
        DeleteForwardId deleteForwardId = new DeleteForwardId();
        ModifyEmployee modifyEmployee = new ModifyEmployee();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        var future = executorService.submit(mainRunnable);

        while (!MainRunnable.isEndProgram()) {
            if (future.isDone()) {
                switch (mainRunnable.getAction()) {
                    case "show":
                        executorService.submit(showListEmployee);
                        break;
                    case "add":
                        executorService.submit(addEmployeeRunnable);
                        break;
                    case "delete":
                        executorService.submit(deleteForwardId);
                        break;
                    case "modify":
                        executorService.submit(modifyEmployee);
                        break;
                }
                future = executorService.submit(mainRunnable);
            }
        }
        executorService.shutdown();
    }
}
