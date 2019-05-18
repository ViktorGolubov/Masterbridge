package co.masterbridge.website.model;

public class User {

    private String userId;
    private String email;
    private String password; //TODO: security risks
    private String userName;
    //TODO: private List<CourseSearch> searches;

    public User(){}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String userId, String userName) {
        this.email = email;
        this.password = password;
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
