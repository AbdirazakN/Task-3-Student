import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        for (;true;) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Write a ID students: ");
            student1.id = scanner.nextByte();

            student1.fullName = "Nurmatov Matraim";
            student1.age = 18;
            student1.group = "Java - 8";

            Student student2 = new Student();
            student2.fullName = "Shadymanov Aftandil";
            student2.age = 20;
            student2.group = "JavaScript - 8";

            Student student3 = new Student();
            student3.fullName = "Akylbek uulu Tologon";
            student3.age = 17;
            student3.group = "JavaScript - 7";

            Student student4 = new Student();
            student4.fullName = "Osorov Bilal";
            student4.age = 16;
            student4.group = "Java - 5";

            Student student5 = new Student();
            student5.fullName = "Amirov Amirbek";
            student5.age = 21;
            student5.group = "Java - 6";

            if (student1.id == 1) {
                System.out.println("1.Full Name:  " + student1.fullName);
                System.out.println("2.Age:  " + student1.age);
                System.out.println("3.Group:  " + student1.group);
            } else if (student1.id == 2) {
                System.out.println("1.Full Name:  " + student2.fullName);
                System.out.println("2.Age:  " + student2.age);
                System.out.println("3.Group:  " + student2.group);
            } else if (student1.id == 3) {
                System.out.println("1.Full Name:  " + student3.fullName);
                System.out.println("2.Age:  " + student3.age);
                System.out.println("3.Group:  " + student3.group);
            } else if (student1.id == 4) {
                System.out.println("1.Full Name:  " + student4.fullName);
                System.out.println("2.Age:  " + student4.age);
                System.out.println("3.Group:  " + student4.group);
            } else if (student1.id == 5) {
                System.out.println("1.Full Name:  " + student5.fullName);
                System.out.println("2.Age:  " + student5.age);
                System.out.println("3.Group:  " + student5.group);
            } else {
                System.out.println("Not found ID!");
            }
        }
    }
}