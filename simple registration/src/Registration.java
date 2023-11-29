import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    private String name;
    private  int id;
    private  String email;
    private  String course;
    // Constructor
    public Student(String name, int id, String email, String course) {
        this.name = name;
        this.id = Integer.parseInt(String.valueOf((id)));;
        this.email = email;
        this.course = course;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
}

public class Registration {
    static List<Student> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        registration();
    }

    public static void registration() {
        System.out.println("Welcome to the student registration system!");

        for (int i = 1; i < 4; i++) {
            System.out.println("Student " + (i + 1) + ": ");

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("ID: ");
            int id = Integer.parseInt(input.nextLine());

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Course: ");
            String course = input.nextLine();

            students.add(new Student(name, id, email, course));

            System.out.println("Registration successful for student " + (i + 1) + "!\n");
        }

        display();
    }

    public static void display() {
        System.out.println("\nHere are the registered students:");

        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Course: " + student.getCourse() + "\n");
        }

        System.out.println("Thank you for using the student registration system!");
    }
}
