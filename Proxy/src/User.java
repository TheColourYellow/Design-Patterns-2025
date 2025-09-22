public class User {
    String username;

    boolean isAdmin = false;

    public User(String username) {
        this.username = username;
    }

    public void setAdmin() {
        isAdmin = true;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
}
