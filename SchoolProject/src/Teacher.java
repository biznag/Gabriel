public class Teacher {
    private String firstName;
    private String lastName;
    private String email;
    private String subject;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    Teacher(String firstName, String lastName, String email, String subject){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
}
