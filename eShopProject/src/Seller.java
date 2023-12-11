import java.util.ArrayList;
import java.util.List;

public class Seller {
    private List<Product> products;
    private List<Promotion> promotions;

    public Seller() {
        this.products = new ArrayList<>();
        this.promotions = new ArrayList<>();
    }



    public void addProduct(Product product) {
        products.add(product);
    }

    public void configurePromotion(Product product, double discount, boolean valid) {
        Promotion promotion = new Promotion(product, discount, valid);
        promotions.add(promotion);
    }


}
