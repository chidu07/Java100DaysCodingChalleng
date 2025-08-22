class Employee {
    String name, job;
    int age;
    Double sal;

    public Employee(String name, String job, int age, Double sal) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.sal = sal;
    }

    public void displayEmplInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); // fixed
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);
    }
}

class DayShift extends Employee {
    String timing;

    public DayShift(String name, String job, int age, Double sal, String timing) {
        super(name, job, age, sal);
        this.timing = timing;
    }

    public void displayEmplInfo() {
        System.out.println("DayShift ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);
        System.out.println("Timings: " + timing);
    }
}

class NightShift extends Employee {
    String timing;
    double night_allowance;

    public NightShift(String name, String job, int age, Double sal, String timing, double night_allowance) {
        super(name, job, age, sal);
        this.timing = timing;
        this.night_allowance = night_allowance;
    }

    public void displayEmplInfo() {
        System.out.println("NightShift");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);
        System.out.println("Timings: " + timing);
        System.out.println("Night-Allowance: " + night_allowance);
    }
}

class Senior extends DayShift {
    int experience;

    public Senior(String name, String job, int age, Double sal, String timing, int experience) {
        super(name, job, age, sal, timing);
        this.experience = experience;
    }

    public void displayEmplInfo() {
        System.out.println("Senior ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);
        System.out.println("Timings: " + timing);
        System.out.println("Experience[in years]: " + experience);
    }
}

class Junior extends DayShift {
    String manager;

    public Junior(String name, String job, int age, Double sal, String timing, String manager) {
        super(name, job, age, sal, timing);
        this.manager = manager;
    }

    public void displayEmplInfo() {
        System.out.println("Junior ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + sal);
        System.out.println("Timings: " + timing);
        System.out.println("Manager: " + manager);
    }
}

public class Requirement3 {
    public static void main(String[] args) {
        NightShift n = new NightShift("Roy", "Manager", 40, 40000.0, "3 PM to 6 AM", 3000);
        n.displayEmplInfo();
        System.out.println();

        DayShift d = new DayShift("Kumar", "Developer", 32, 45000.0, "9 AM to 6 PM");
        d.displayEmplInfo();
        System.out.println();

        Senior s = new Senior("Kumar", "Developer", 32, 45000.0, "9 AM to 6 PM", 7);
        s.displayEmplInfo();
        System.out.println();

        Junior j = new Junior("Ragav", "Developer", 28, 35000.0, "9 AM to 6 PM", "Kumar");
        j.displayEmplInfo();
    }
}
