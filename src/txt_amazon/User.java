package txt_amazon;

public class User {
    private String userId;
    private String profileName;

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

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", profileName='" + profileName + '\'' +
                '}';
    }
}
