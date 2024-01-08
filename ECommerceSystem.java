import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}

class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products); // Return a copy to prevent direct modification
    }
}

class Order {
    private int orderId;
    private List<Product> products;
    private String status;

    public Order(int orderId, List<Product> products, String status) {
        this.orderId = orderId;
        this.products = products;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        // Sample usage of the system
        Product laptop = new Product(1, "Laptop", 999.99);
        Product smartphone = new Product(2, "Smartphone", 499.99);

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(smartphone);

        Order order = new Order(1, cart.getProducts(), "Pending");

        // Check order status
        System.out.println("Order Status: " + order.getStatus());
    }
}
