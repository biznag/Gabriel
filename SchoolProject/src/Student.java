public class Student {
    //fields of the Student class
    private String fisrtName;
    private String lastName;
    private int grade;
    private int studentId;
    static int idNum = 0;

    //getters and setters of the student class
    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    //constructor for the student class
    Student(String fisrtName, String lastName, int grade){
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.grade = grade;
        idNum++;
        studentId = idNum;
    }
}
