import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Product> favoriteList;
    private List<Order> orders;

    public Client() {
        this.favoriteList = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void buyProduct(BuyProductCommand buyCommand) {
        buyCommand.execute();
    }

    public void addToFavoriteList(Product product) {
        favoriteList.add(product);
    }

    public void cancelOrder(Order order) {
        orders.remove(order);
        order.cancel();
    }


}
