package txt_amazon;

import java.util.ArrayList;

public class Product {
    private String productId;
    private String title;
    private Double price;
    static double UNKNOWN_PRICE = -1;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Product(String productId, String title, Double price) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void novaReview(Review review){
        this.reviews.add(review);
    }

    public ArrayList<Review> getReviews(){
        return this.reviews;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

