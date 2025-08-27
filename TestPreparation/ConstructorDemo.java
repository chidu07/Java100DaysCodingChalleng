

class Student {
    int id;
    String name, course;

    public Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, String course) {
        this(id, name);

        this.course = course;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        // System.out.println("Course: " + (course != null ? course : "Not Assigned"));
        if (course != null) {
            System.out.println("Course: " + course);
        }
    }

}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Chidu");
        Student s2 = new Student(1, "Chidu", "cs");
        s1.display();
        System.out.println("------------------------------");
        s2.display();

    }
}
