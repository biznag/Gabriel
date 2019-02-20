public class Main {
    public static void main(String[] args){

        Teacher Gabriel = new Teacher("Gabe", "Ness");

        System.out.println(Gabriel);

        Gabriel.addClass("Science");
        Gabriel.addClass("Drama");
        Gabriel.addClass("Math");

        Gabriel.printClasses();
        Gabriel.removeClass("Science");
        Gabriel.removeClass("Science");

        Gabriel.printClasses();
    }
}
