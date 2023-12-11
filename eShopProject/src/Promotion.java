public class Promotion {
    private Product product;
    private double discountPercentage;
    private boolean valid;


    public Promotion(Product product, double discountPercentage, boolean valid) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.valid = valid;
    }

    public void applyDiscount() {
        if (valid) {
            // Apply discount to the product
            double originalPrice = product.getPrice();
            double discountedPrice = originalPrice * (1 - (discountPercentage / 100));
            product.setPrice(discountedPrice);
            System.out.println("Discount applied to " + product.getName() + ": New price is " + discountedPrice);
        } else {
            System.out.println("Promotion for " + product.getName() + " is not currently active.");
        }
    }
    }


