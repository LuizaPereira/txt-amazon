package txt_amazon;

public class Review {
    public double score;
    public long time;
    public String summary;
    public String text;

    public Review(double score, long time, String summary, String text) {
        this.score = score;
        this.time = time;
        this.summary = summary;
        this.text = text;
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
}
