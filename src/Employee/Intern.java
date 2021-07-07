package Employee;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showMe() {
        this.showInfo();
        System.out.println("Majors    : " + this.majors);
        System.out.println("Semester  : " + this.semester);
        System.out.println("University: " + this.universityName);
    }

    public Intern() {
        super();
    }
}
