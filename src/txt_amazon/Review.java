package txt_amazon;

public class Review {
    public User user;
    public Product product;
    public Helpfulness helpfulness;
    private double score;
    private long time;
    private String summary;
    private String text;

    public Review(User user, Product product, Helpfulness helpfulness, double score, long time, String summary, String text) {
        this.score = score;
        this.time = time;
        this.summary = summary;
        this.text = text;
        this.user = user;
        this.product = product;
        this.helpfulness = helpfulness;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Helpfulness getHelpfulness() {
        return helpfulness;
    }

    public void setHelpfulness(Helpfulness helpfulness) {
        this.helpfulness = helpfulness;
    }

    public double getScore() { return score; }

    public void setScore(double score) { this.score = score; }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Review{" +
                "user=" + user +
                ", product=" + product +
                ", helpfulness=" + helpfulness +
                ", score=" + score +
                ", time=" + time +
                ", summary='" + summary + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
