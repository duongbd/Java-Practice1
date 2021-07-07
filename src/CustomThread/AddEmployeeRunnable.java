package CustomThread;


import Employee.Employee;
import Employee.Experience;
import Employee.Fresher;
import Employee.Intern;
import Exeption.BirthDayException;
import Exeption.EmailException;
import Exeption.FullNameException;
import Exeption.PhoneException;
import com.company.Main;

import java.util.Scanner;

public class AddEmployeeRunnable implements Runnable {
    final static String REGEX_BIRTH_DAY = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
    final static String REGEX_EMAIL = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    final static String REGEX_PHONE = "[\\d]{9,12}";
    final static String REGEX_FULL_NAME = "[\\D]{1,30}";

    private void addEmployee(Employee employee, Scanner scanner) {
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();
        if (fullName.matches(REGEX_FULL_NAME)) {
            employee.setFullName(fullName);
        } else throw new FullNameException();

        System.out.println("Birth day: ");
        String birthDay = scanner.nextLine();
        if (birthDay.matches(REGEX_BIRTH_DAY)) {
            employee.setBirthDay(birthDay);
        } else throw new BirthDayException();

        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        if (phone.matches(REGEX_PHONE)) {
            employee.setPhone(phone);
        } else throw new PhoneException();

        System.out.println("Email: ");
        String email = scanner.nextLine();
        if (email.matches(REGEX_EMAIL)) {
            employee.setEmail(email);
        } else throw new EmailException();
        Main.employeeList.add(employee);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Add employee---");
        System.out.println("Type \"0\" to \"2\", \"0\" is Experience, \"1\" is Fresher, \"2\" is Intern");
        System.out.print("Employee type: ");
        switch (scanner.nextLine()) {
            case "0":
                Experience experience = new Experience();
                experience.setEmployeeType(0);
                addEmployee(experience,scanner);
                System.out.print("Exp In Year: ");
                experience.setExpInYear(Integer.parseInt(scanner.nextLine()));
                System.out.print("Pro Skill: ");
                experience.setProSkill(scanner.nextLine());
                break;
            case "1":
                Fresher fresher = new Fresher();
                fresher.setEmployeeType(1);
                addEmployee(fresher, scanner);
                System.out.print("Graduation date: ");
                fresher.setGraduationDate(scanner.nextLine());
                System.out.print("Graduation rank: ");
                fresher.setGraduationRank(scanner.nextLine());
                break;
            case "2":
                Intern intern = new Intern();
                intern.setEmployeeType(2);
                addEmployee(intern, scanner);
                System.out.print("Majors: ");
                intern.setMajors(scanner.nextLine());
                System.out.print("Semester: ");
                intern.setSemester(scanner.nextLine());
                System.out.print("University name: ");
                intern.setUniversityName(scanner.nextLine());
                break;
            case "quit":
                break;
            default:
                System.out.println("Type \"0\" to \"2\", \"0\" is Experience, \"1\" is Fresher, \"2\" is Intern");
        }
    }
}
