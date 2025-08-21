class ShoppingCart {
    int quantity, price;
    String product;

    public ShoppingCart(String product, int quantity, int price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;

    }

    public ShoppingCart(int price, String product) {
        this.price = price;
        this.product = product;
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
    }

    public ShoppingCart(String product) {
        this.product = product;

        System.out.println("Product: " + product);
    }

    void displayItems() {
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + (price * quantity));

    }

}

public class Requirement2 {
    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart("Lays", 4, 10);
        ShoppingCart s2 = new ShoppingCart("Oreo", 2, 30);
        ShoppingCart s3 = new ShoppingCart("Biscuit", 30, 20);
        ShoppingCart s4 = new ShoppingCart("Lays");
        System.out.println("-------------------------------------------------------");

        ShoppingCart s5 = new ShoppingCart(5, " Dairy Milk ");
        System.out.println("-------------------------------------------------------");

        s1.displayItems();
        System.out.println("-------------------------------------------------------");
        s2.displayItems();
        System.out.println("-------------------------------------------------------");

        s3.displayItems();

    }
}
