package methods;


public class SocialMediaUser {

    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    int age;


    public void setUserName(String username){
        boolean isValidUserName = true;
        if(username.length() <= 16 && !username.isEmpty() && !username.contains(" ") && !username.equals(null)){
            this.username = username;
            isValidUserName = true;
        }
        if(isValidUserName){
            System.out.println("SUCCESS: Username is valid");
            this.username = username;
        }
        else {
            System.out.println("FAILURE: Username is invalid");
        }

    }

    public void setPassword(String password){
        boolean isValidPassword = true;
        if(16 >= password.length() && password.length() >= 8){
            String upperCaseRegex = "[A-Z]";
            String lowerCaseRegex = "[a-z]";
            String digitRegex = "\\d";
            String specialCharRegex = "[!@#\\%&\\&\\*.|=+-\\>||<:;{\\}]";

            if(!password.matches(upperCaseRegex) || !password.matches(lowerCaseRegex) ||
            !password.matches(digitRegex) || !password.matches(specialCharRegex)){
                isValidPassword = false;
            } else {
                System.out.println("Error");
            }

        } else {
            System.out.println("Error: the length of password should be not less than 16 and more than 8");
        }
        if(isValidPassword){
            System.out.println("SUCCESS: The password is valid.");
            this.password = password;
        }
        else {
            System.out.println("FAILURE: The password is invalid.");
        }
    }

    public void setAge(int age){
        boolean isValidAge = true;
        if(age <= 0){
            isValidAge = false;
        }
        if(isValidAge){
            System.out.println("SUCCESS: The age is valid.");
            this.age = age;
        }
        else {
            System.out.println("FAILURE: The age is invalid.");
        }
    }

    public void setEmail(String email){
        boolean isValidEmail = true;
        if(email.length() > 32 && !email.contains("@") ){
            isValidEmail = false;
        }
        if(isValidEmail){
            System.out.println("SUCCESS: The email is valid.");
            this.email = email;
        }
        else {
            System.out.println("FAILURE: The email is invalid.");
        }
    }
    public void login (String username, String password){
        if(this.username.equals(username)){
            System.out.println("The username is correct!");
        } else {
            System.out.println("The username is incorrect");
        }
        if(this.password.equals(password)){
            System.out.println("The password is correct!");
        } else {
            System.out.println("The password is incorrect.");
        }

    }

    public void resetPassword(String newPassword){
        this.password = newPassword;
        System.out.println("The new Password is: " + newPassword);
    }

    public void getFullName(){
        System.out.println("Your full name is " + firstName + " " + lastName);

    }

    public boolean isAdult(){
        if(age >= 18){
            System.out.println("The user is " + age + " years old");
            return true;
        }
        else {
            System.out.println("User is under 18");
            return false;
        }

    }
}
