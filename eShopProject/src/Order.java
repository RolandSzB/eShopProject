import java.util.List;

public class Order {
    private List<Product> products;
    private Payment payment;
    private Delivery delivery;

    public Order(List<Product> products, Payment payment, Delivery delivery) {
        this.products = products;
        this.payment = payment;
        this.delivery = delivery;
    }

    public double calculateTotal() {
        // Calculate total logic
        // ...
        return 5;
    }

    public void processPayment() {
        payment.processPayment(calculateTotal());
    }

    public void cancel() {
        // Cancel order logic
        // ...
    }

    // Other order-related methods
    // ...
}
