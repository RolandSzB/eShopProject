 class Product {
    private String name;
    private String category;
    private int stock;
    private double price;

    public Product(String name, String category, int stock, double price) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price;
    }

    public void updateStock(int quantity) {
        if (quantity >= 0) {
            this.stock += quantity;
            System.out.println("Stock for " + name + " updated to: " + stock);
        } else {
            System.out.println("Invalid quantity for updating stock.");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
