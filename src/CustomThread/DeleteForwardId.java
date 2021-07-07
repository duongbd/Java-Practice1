package CustomThread;

import Employee.Employee;
import Employee.Experience;
import com.company.Main;

import java.util.Scanner;

public class DeleteForwardId implements Runnable {

    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("---Delete employee---");
        System.out.print("Delete employee Id: ");
        int Id=Integer.parseInt(scanner.nextLine());
        if (Main.employeeList.removeIf(employee -> employee.getId() == Id)){
            System.out.println("Employee removed");
        }
        else System.out.println("Not found id");
    }
}
