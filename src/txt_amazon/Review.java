package txt_amazon;

public class Review {
    private double score;
    private long time;
    private String summary;
    private String text;
    private User user;
    private Helpfulness helpfulness;

    public Review(double score, long time, String summary, String text, User user, Helpfulness helpfulness) {
        this.score = score;
        this.time = time;
        this.summary = summary;
        this.text = text;
        this.user = user;
        this.helpfulness = helpfulness;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Helpfulness getHelpfulness() {
        return helpfulness;
    }

    public void setHelpfulness(Helpfulness helpfulness) {
        this.helpfulness = helpfulness;
    }

    @Override
    public String toString() {
        return "Review{" +
                "score=" + score +
                ", time=" + time +
                ", summary='" + summary + '\'' +
                ", text='" + text + '\'' +
                ", user=" + user +
                '}';
    }
}
