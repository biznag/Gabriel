import java.util.ArrayList;

public class Teacher extends Person {
    static int teacherID = 0;
    public String teacher;
    public String course;
    public ArrayList<String> courses = new ArrayList<>();

    Teacher(int teacherId, String firstName, String lastName){
        this.teacherID = teacherID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacher = teacher;
        this.courses = courses;
    }

    Teacher (String firstName, String lastName){
        super(firstName, lastName);
        teacherID++;
        teacher = firstName + lastName;
    }

    public void addClass(String course){
        for(int i = 0; i <= courses.size(); i++){
            System.out.println(i);
            if (courses.equals(course)){
                System.out.println("Course already exists.");
            }
            else{
                courses.add(course);
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
        return "Teacher ID: " + teacherID + "\nFirst name: " + firstName + " " + lastName;
    }

}
