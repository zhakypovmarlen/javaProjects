package IfElse;

public class AndOperator {
    public static void main(String[] args) {


        if (2 < 3 && 5 < 10){
            System.out.println("bye bye");
        }

        if (false && true){
            System.out.println("potato");
        }

        if (true && false){
            System.out.println("do something");
        }

        if (true && true){
            System.out.println("finally true");
        }





        String username = "sunshine123";
        String password = "moonlight456!true";
        String email = "sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com";

        /*
        if(enteredUsername.equals(username ) && enteredPassword.equals(password)) {
            System.out.println("Logged in");
        } else if (enteredUsername.equals(username) && !enteredPassword.equals(password)){
            System.out.println("incorrect password, try again");
        } else if (!enteredUsername.equals(username) && !enteredEmail.equals(email)){
            System.out.println("username does not exist");
        } else if(!enteredUsername.equals(username) && enteredEmail.equals(email) && enteredPassword.equals(password)){
            System.out.println("recover username");
        } else if(enteredUsername.equals(username) && enteredEmail.equals(email) && !enteredPassword.equals(password)){
            System.out.println("recover password");
        } else if(enteredUsername.equals(username) && !enteredEmail.equals(email) && enteredPassword.equals(password)){
            System.out.println("recover Email");
        }
        */


        if(enteredUsername.equals(username) && enteredPassword.equals(password)){
            System.out.println("Logged in");
            if(!enteredEmail.equals(email)){
                System.out.println("Recover Email");
            }
        } else if(enteredUsername.equals(username) && enteredEmail.equals(email)){
            System.out.println("");
            if(!enteredPassword.equals(password)){
                System.out.println("Recover password");
            }
        } else if(enteredPassword.equals(password) && enteredEmail.equals(email)){
            System.out.println("");
            if(!enteredUsername.equals(username)){
                System.out.println("Recover username");
            }
        } else if(enteredUsername.equals(username) && enteredPassword.equals(password) && enteredEmail.equals(email)){
            System.out.println("Logged in");
        } else if(enteredUsername.equals(username) && !enteredPassword.equals(password)){
            System.out.println("Password is incorrect");
        } else if(!enteredUsername.equals(username) && !enteredPassword.equals(password)){
            System.out.println("Both username and password are incorrect");
        }







    }
}
