package CustomThread;

import java.util.Scanner;

public class MainRunnable implements Runnable {
    public static void setAction(String action) {
        MainRunnable.action = action;
    }

    private static String action="";
    private static boolean isEndProgram = false;

    public static boolean isEndProgram() {
        return isEndProgram;
    }

    public String getAction() {
        return action;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isStopProgram = false;
        System.out.println("---Main Menu---");
        while (!isStopProgram) {
            switch (scanner.nextLine().toLowerCase()) {
                case "add":
                    isStopProgram = true;
                    action = "add";
                    break;
                case "modify":
                    isStopProgram = true;
                    action = "modify";
                    break;
                case "delete":
                    isStopProgram = true;
                    action = "delete";
                    break;
                case "show":
                    isStopProgram = true;
                    action = "show";
                    break;
                case "quit":
                    isEndProgram = true;
                    isStopProgram = true;
                    break;
                case "help":
                    System.out.println("add     - to add a employee");
                    System.out.println("modify  - to modify employee by id");
                    System.out.println("delete  - to delete a employee");
                    System.out.println("show    - to show all employee info by type");
                    System.out.println("quit    - to quit");
                    break;
                default:
                    System.out.println("Unknown command, type \"help\" to more detail");
            }
        }
    }
}
