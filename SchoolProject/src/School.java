import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String schoolName;
    private int schoolAge;
    private String schoolMaskot;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolAge() {
        return schoolAge;
    }

    public void setSchoolAge(int schoolAge) {
        this.schoolAge = schoolAge;
    }

    public String getSchoolMaskot() {
        return schoolMaskot;
    }

    public void setSchoolMaskot(String schoolMaskot) {
        this.schoolMaskot = schoolMaskot;
    }


}