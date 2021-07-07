package CustomThread;

import Employee.Employee;
import Employee.Experience;
import Employee.Fresher;
import Employee.Intern;
import com.company.Main;

import java.util.Scanner;

public class ShowListEmployee implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Show list employee---");
        System.out.println("Type \"all\" to list all, \"0\" to list Experience,\"1\" to list Fresher,\"2\" to list Intern");
        switch (scanner.nextLine()) {
            case "all":
                if (!Main.employeeList.isEmpty()) {
                    for (Employee employee : Main.employeeList) {
                        employee.showMe();
                        System.out.println("++++++++++");
                    }
                } else System.out.println("The list employee is empty");
                break;
            case "0":
                if (!Main.employeeList.isEmpty()) {
                    for (Employee employee : Main.employeeList) {
                        if (employee instanceof Experience) {
                            employee.showInfo();
                            employee.showMe();
                            System.out.println();
                        }
                    }
                } else System.out.println("The list Experience is empty");
                break;
            case "1":
                if (!Main.employeeList.isEmpty()) {
                    for (Employee employee : Main.employeeList) {
                        if (employee instanceof Fresher) {
                            employee.showInfo();
                            employee.showMe();
                            System.out.println();
                        }
                    }
                } else System.out.println("The list Fresher is empty");
                break;
            case "2":
                if (!Main.employeeList.isEmpty()) {
                    for (Employee employee : Main.employeeList) {
                        if (employee instanceof Intern) {
                            employee.showInfo();
                            employee.showMe();
                            System.out.println();
                        }
                    }
                } else System.out.println("The list Intern is empty");
                break;
            case "quit":
                break;
            default:
                System.out.println("Unknown command, auto back to Main menu");
        }
    }
}
