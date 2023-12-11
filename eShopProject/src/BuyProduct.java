
   public class BuyProduct implements BuyProductCommand {
        private Product product;

        public BuyProduct(Product product) {
            this.product = product;
        }

        @Override
        public void execute() {
            if (product.getStock() > 0) {
                System.out.println("Buying " + product.getName());
                product.updateStock(product.getStock() - 1);
            } else {
                System.out.println("Product " + product.getName() + " is out of stock.");
            }
        }
    }

