package Employee;

import Exeption.BirthDayException;
import Exeption.EmailException;

public abstract class Employee {
    final static String REGEX_BIRTH_DAY = "[\\d]{2}/[\\d]{2}/[\\d]{4}";
    final static String REGEX_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";

    static private int employeeCount = 0;
    private int Id,employeeType;
    private String fullName, birthDay, phone, email;

    public static boolean isValidateBirthDay(String birthDay) {
        return birthDay.matches(REGEX_BIRTH_DAY);
    }
    public static boolean isValidateEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void increaseEmployeeCount() {
        Employee.employeeCount++;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
            if (Employee.isValidateBirthDay(birthDay)){
                this.birthDay=birthDay;
            }
            else throw new BirthDayException();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Employee.isValidateEmail(email)){
            this.email=email;
        }
        else throw new EmailException();
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public Employee(int Id, String fullName, String birthDay, String phone, String email, int employeeType) {
        this.Id = Id;
        this.setFullName(fullName);
        this.setBirthDay(birthDay);
        this.setPhone(phone);
        this.setEmail(email);
        this.employeeType = employeeType;
    }
    public void showInfo(){
        System.out.println(this.Id);
        System.out.println(this.fullName);
        System.out.println(this.birthDay);
        System.out.println(this.phone);
        System.out.println(this.email);
        System.out.println(this.employeeType);
    }
    abstract void showMe();
}
