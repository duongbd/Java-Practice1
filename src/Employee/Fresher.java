package Employee;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showMe() {
        this.showInfo();
        System.out.println("Grad Date : "+this.graduationDate);
        System.out.println("Grad Rank : "+this.graduationRank);
        System.out.println("Education : "+this.education);
    }
    public Fresher(){
        super();
    }
}
