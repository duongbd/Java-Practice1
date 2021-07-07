package Employee;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public Experience(String fullName, String birthDay, String phone, String email, int employeeType, int expInYear, String proSkill) {
        super(employeeType, fullName, birthDay, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(){
        super();
    }

    @Override
    public void showMe() {
        this.showInfo();
        System.out.println("ExpInYear : "+this.expInYear);
        System.out.println("Pro skill : "+this.proSkill);
    }
}
