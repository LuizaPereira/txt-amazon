package txt_amazon;

public class Helpfulness {
    private int positive;
    private int total;

    public Helpfulness(int positive, int total) {
        this.positive = positive;
        this.total = total;
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Helpfulness{" +
                "positive=" + positive +
                ", total=" + total +
                '}';
    }
}
