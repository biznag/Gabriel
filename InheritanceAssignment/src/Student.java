import java.util.ArrayList;

public class Student extends Person {
    static int studentID = 0;
    public String student;
    public String course;
    public ArrayList<String> courses = new ArrayList<>();

    Student(int teacherId, String firstName, String lastName){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.student = student;
        this.courses = courses;
    }

    Student (String firstName, String lastName){
        super(firstName, lastName);
        studentID++;
        student = firstName + lastName;
    }

    public void addClass(String course){
        for(int i = 0; i <= courses.size(); i++){
            if (courses.equals(course)){
                System.out.println("Course already exists.");
            }
            else{
                courses.add(course);
                System.out.println("Course added");
                break;
            }
        }
    }
    public void removeClass(String course){
        courses.remove(course);
    }
    public void printClasses(){
        System.out.println(courses);
    }
    @Override
    public String toString() {
        return "Student ID: " + studentID + "\nFirst name: " + firstName + " " + lastName;
    }

}
