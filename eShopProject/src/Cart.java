import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productsInCart;
    private PaymentStrategy paymentStrategy;

    public Cart() {
        this.productsInCart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsInCart.add(product);
    }

    public void removeProduct(Product product) {
        productsInCart.remove(product);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double totalPrice) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(totalPrice);
            productsInCart.clear(); // Clearing cart after successful payment
            System.out.println("Checkout completed. ");
        } else {
            System.out.println("Please set a payment method before checkout.");
        }
    }

}
