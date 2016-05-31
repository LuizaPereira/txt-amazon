package txt_amazon;

import java.util.ArrayList;

public class User {
    private String userId;
    private String profileName;
    private ArrayList<Review> reviews = new ArrayList<>();

    public User(String userId, String profileName) {
        this.userId = userId;
        this.profileName = profileName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void novaReview(Review review){
        this.reviews.add(review);
    }
    public ArrayList<Review> getReviews(){
        return this.reviews;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", profileName='" + profileName + '\'' +
                '}';
    }
}
