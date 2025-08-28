

class Employee {
    int eid;
    String ename;
    double sal;

    public Employee() {
        System.out.println("Employee Created");
    }

    public Employee(int eid, String ename) {
        this();
        this.eid = eid;
        this.ename = ename;
    }

    public Employee(int eid, String ename, double sal) {
        this(eid, ename);

        this.sal = sal;
    }

}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "chidu", 80000);

    }
}

