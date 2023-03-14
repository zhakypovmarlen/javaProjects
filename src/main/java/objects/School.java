package objects;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "123456789";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "Law";

        Student student2 = new Student();
        student2.name = "Marlen";
        student2.phone = "7137375327";
        student2.email = "marlenzhakypov@gmail.com";
        student2.age = 22;
        student2.major = "Computer Science";


        student2.attendClass();
        student2.sleep();
        student1.info();
        student2.info();
    }
}
