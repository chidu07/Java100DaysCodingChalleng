

class Vehicle {
    String brand;
    double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

}

class Car extends Vehicle {
    int seating_capacity;

    public Car(String brand, double price, int seating_capacity) {
        super(brand, price);
        this.seating_capacity = seating_capacity;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.err.println("Seating Capacity: " + seating_capacity);
    }

}

public class ConstructorPlusSuperMethodDemo {
    public static void main(String[] args) {
        Vehicle v = new Car("Toyato", 4000000, 6);
        v.display();

    }

}
