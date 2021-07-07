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

public class ModifyEmployee implements Runnable {
    private void modifyEmployee(Employee employee, Scanner scanner) {
        System.out.println("Full name: ");
        String fullName = scanner.nextLine();
        if (fullName.matches(AddEmployeeRunnable.REGEX_FULL_NAME)) {
            employee.setFullName(fullName);
        } else throw new FullNameException();

        System.out.println("Birth day: ");
        String birthDay = scanner.nextLine();
        if (birthDay.matches(AddEmployeeRunnable.REGEX_BIRTH_DAY)) {
            employee.setBirthDay(birthDay);
        } else throw new BirthDayException();

        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        if (phone.matches(AddEmployeeRunnable.REGEX_PHONE)) {
            employee.setPhone(phone);
        } else throw new PhoneException();

        System.out.println("Email: ");
        String email = scanner.nextLine();
        if (email.matches(AddEmployeeRunnable.REGEX_EMAIL)) {
            employee.setEmail(email);
        } else throw new EmailException();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Modify employee---");
        System.out.print("Modify employee Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean foundId = false;
        for (Employee employee : Main.employeeList) {
            if (employee.getId() == id) {
                foundId = true;
                switch (employee.getEmployeeType()) {
                    case 0:
                        Experience experience = (Experience) employee;
                        modifyEmployee(experience, scanner);
                        System.out.print("Exp In Year: ");
                        experience.setExpInYear(Integer.parseInt(scanner.nextLine()));
                        System.out.print("Pro Skill: ");
                        experience.setProSkill(scanner.nextLine());
                        break;
                    case 1:
                        Fresher fresher = (Fresher) employee;
                        System.out.print("Graduation date: ");
                        fresher.setGraduationDate(scanner.nextLine());
                        System.out.print("Graduation rank: ");
                        fresher.setGraduationRank(scanner.nextLine());
                        break;
                    case 2:
                        Intern intern = (Intern) employee;
                        System.out.print("Majors: ");
                        intern.setMajors(scanner.nextLine());
                        System.out.print("Semester: ");
                        intern.setSemester(scanner.nextLine());
                        System.out.print("University name: ");
                        intern.setUniversityName(scanner.nextLine());
                        break;
                }
                break;
            }
        }
        if (!foundId) System.out.println("Not found id");
    }
}