public class AccessControlService {

    private static AccessControlService instance;
    private AccessControlService() {}
    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }


    public void isAllowed(int id, User user) throws AccessException {
        if (user.isAdmin()) {
            System.out.println("Access granted");
        }
        else throw new AccessException("User status not verfied");
    }
}
