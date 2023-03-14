package methods;

public class SocialMediaMain {
    public static void main(String[] args) {

        SocialMediaUser user1 = new SocialMediaUser();
        SocialMediaUser user2 = new SocialMediaUser();

        user1.firstName = "Marlen";
        user1.lastName = "Zhakypov";
        user1.age = 17;
        user1.email = "marlenzhakypov@gmail.com";
        user1.username = "marlenzhakypov";
        user1.password = "Valid1323";

        user1.getFullName();
        user1.isAdult();
        user1.setPassword("Valid1255");
        user1.setUserName("marlenzhakyp");
        user1.login("marlenzhakypo", "valid12");

    }
}
