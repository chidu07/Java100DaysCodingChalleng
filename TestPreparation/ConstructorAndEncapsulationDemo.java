

class Parent {
    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public void display() {
    // System.out.println("Name: " + name);
    // System.out.println("Age: " + age);
    // }

}

class Employee extends Parent {
    private int eid;
    private double sal;

    public Employee(String name, int age, int eid, double sal) {
        super(name, age);
        this.eid = eid;
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public int getEid() {
        return eid;
    }

}

public class ConstructorAndEncapsulationDemo {
    public static void main(String[] args) {
        Employee p = new Employee("chidu", 24, 1, 78000);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getEid());
        System.out.println(p.getSal());

    }
}

