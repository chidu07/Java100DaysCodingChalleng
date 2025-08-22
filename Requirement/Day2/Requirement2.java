class ShoppingCart {
    String name;
    int quantity;
    double total, price;

    public ShoppingCart(String name, int quantity, double total, double price) {
        this.name = name;
        this.quantity = quantity;
        this.total = total;
        this.price = price * quantity;
    }

    public ShoppingCart(String name) {
        this.name = name;
    }

    public ShoppingCart(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void displayItems() {
        System.out.println("ElectronicProducts ");
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total:  " + total);

    }

}

class ElectronicProducts extends ShoppingCart {
    String warrenty;

    ElectronicProducts(String name, int quantity, double total, double price, String warrenty) {
        super(name, quantity, total, price);
        this.warrenty = warrenty;

    }

    ElectronicProducts(String name, int quantity, String warrenty) {
        super(name, quantity);
        this.warrenty = warrenty;
        System.out.println("ElectronicProduct ");
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Warranty: " + warrenty);

    }

    public void displayItems() {
        System.out.println("ElectronicProducts ");
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total:  " + total);
        System.out.println("Warranty: " + warrenty);

    }
}

class ClothProducts extends ShoppingCart {
    String size;

    public ClothProducts(String name, int quantity, double total, double price, String size) {
        super(name, quantity, total, price);
        this.size = size;
    }

    public ClothProducts(String name, String size) {
        super(name);
        this.size = size;
        System.out.println("ClothProduct");
        System.out.println("Product: " + name);
        System.out.println("Size: " + size);
    }

    public void displayItems() {
        System.out.println("ClothProduct ");
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total:  " + total);
        System.out.println("Size: " + size);

    }

}

public class Requirement2 {
    public static void main(String[] args) {
        ElectronicProducts e = new ElectronicProducts("iPhone ", 1, 15000, 15000, "4 years");
        e.displayItems();
        System.out.println();
        ClothProducts c = new ClothProducts("shirt", 2, 1000, 2000, "Medium");
        c.displayItems();
        System.out.println();
        ElectronicProducts e1 = new ElectronicProducts("Headphones ", 3, "1 year");
        System.out.println();
        ClothProducts c1 = new ClothProducts("Shoes", "8");

    }

}
