public class Person {
    protected String lastName;
    protected String firstName;

    Person(){
        lastName = "";
        firstName = "";
    }
    Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    protected void printName(){
        System.out.println("FirstName: " + firstName + "LastName: " + lastName);
    }

}


