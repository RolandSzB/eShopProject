// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a seller
        Seller seller = new Seller();

        // Create a product
        Product product = new Product( "Laptop", "Electronics", 10, 999.99);

        // Seller adds the product
        seller.addProduct(product);

        // Create a promotion for the product
        boolean validPeriod = true;
        seller.configurePromotion(product, 15.0, validPeriod);

        // Create a client
        Client client = new Client();

        // Client buys the product
        BuyProductCommand buyCommand = new BuyProduct(product);
        client.buyProduct( buyCommand);
    }
    }
