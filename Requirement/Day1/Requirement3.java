class Employee {
    String name, job;
    long sal;
    int age;

    public Employee(String name, String job, long sal, int age) {
        this.name = name;
        this.job = job;
        this.sal = sal;
        this.age = age;
    }
    

    public Employee(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
    }

    public Employee(String job, long sal) {
        this.job = job;
        this.sal = sal;
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);
    }

    void displayEmplInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);

    }

}

public class Requirement3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Roy", "Manager", 40000, 40);
        e1.displayEmplInfo();
        System.out.println("---------------------------------------------");
        Employee e2 = new Employee("Dhruv", "Developer", 30000, 26);
        e2.displayEmplInfo();
        System.out.println("---------------------------------------------");
        Employee e3 = new Employee("Kiran", "Developer");
        System.out.println("---------------------------------------------");
        Employee e4 = new Employee("Tester", 45000);

    }

}
