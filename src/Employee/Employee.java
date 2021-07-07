package Employee;

import java.util.List;

public abstract class Employee {

    static private int employeeCount = 0;
    private int Id,employeeType;
    private String fullName, birthDay, phone, email;

    public List<Certificated> getCertificateds() {
        return certificateds;
    }

    private List<Certificated> certificateds;

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
                this.birthDay=birthDay;
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
            this.email=email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public Employee(int employeeType, String fullName, String birthDay, String phone, String email) {
        Id = ++employeeCount;
        this.employeeType = employeeType;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
    }

    public Employee(){
        Id=++employeeCount;
    }

    public void showInfo(){
        System.out.println("ID        : "+this.Id);
        System.out.println("Full name : "+this.fullName);
        System.out.println("Birth day : "+this.birthDay);
        System.out.println("Phone     : "+this.phone);
        System.out.println("Email     : "+this.email);
        System.out.println("Type      : "+this.employeeType);
    }
    abstract public void showMe();
}
