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

    public Experience(int Id, String fullName, String birthDay, String phone, String email, int employeeType, int expInYear, String proSkill) {
        super(Id, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    void showMe() {
        this.showInfo();
        System.out.println(this.expInYear);
        System.out.println(this.proSkill);
    }
}
