package txt_amazon;

public class Product {
    public String productId;
    public String title;
    public double price;
    public static double UNKOWN_PRICE = -1;

    public Product(String productId, String title, double price) {
        this.productId = productId;
        this.title = title;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

