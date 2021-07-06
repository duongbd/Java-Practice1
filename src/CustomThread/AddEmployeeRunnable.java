package CustomThread;

import java.util.Scanner;

public class AddEmployeeRunnable implements Runnable {
    @Override
    public void run() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("---Add employee---");
        System.out.println("Type \"0\" to \"2\", \"0\" is Experience, \"1\" is Fresher, \"2\" is Intern");
        System.out.print("Employee type: ");
        switch (scanner.nextLine()) {
            case "0":
                break;
            case "1":
                break;
            case "2":
                break;
            default:
                System.out.println("Type \"0\" to \"2\", \"0\" is Experience, \"1\" is Fresher, \"2\" is Intern");
        }
        System.out.println("Full name: ");
        System.out.println("Birth day: ");
        System.out.println("Phone: ");
        System.out.println("Email: ");
    }
}
