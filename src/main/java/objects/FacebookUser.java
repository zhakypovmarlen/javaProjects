package objects;

public class FacebookUser {


    String username;
    String password;
    String firstName;
    String lastName;
    public void login(String username, String password){
        System.out.println(username + " logged in to the application");


    }

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();


    }
}
