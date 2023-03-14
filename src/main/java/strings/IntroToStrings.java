package strings;

public class IntroToStrings {

    public static void main(String[] args) {


        String firstName = "Mario ";
        String lastName = "Balotelli";
        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName + lastName;
        System.out.println(fullName);

        firstName = "Mike";
        lastName = "Wazowski";

        String myFirstName = "Marlen";
        String myLastName = "Zhakypov";
        char space = ' ';
        String myFullName = myFirstName + space + myLastName;
        System.out.println("My name is " + myFullName);

        byte age = 22;
        System.out.println("I am " + age + space + "years old.");

        String address = "4034 N Saint Louis Avenue, 60618, Chicago, Illinois.";
        System.out.println("My address is " + address);



        String city = "London";
        System.out.println(city);

        String city2 = new String("New York");
        System.out.println(city2);

        System.out.println(city.length());  // length method returns the amount of characters in the value of city variable
        System.out.println(city2.length()); // the number of characters in the value of variable is 8

        String name = "Antananarivo";
        System.out.println("The length of Antananarivo is: " + name.length());

        System.out.println("Marlen".length());


        // equals() method compares values of 2 Strings

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";
        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame);

        isSame = fruit1.equals(fruit3);
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println(fruit1.equals(fruit2));

        boolean isSame2 = !fruit1.equals(fruit2);    // !not equals, TRUE
        System.out.println(isSame2);



        int cucumber = 5;
        int tomato = 10;
        int milk = cucumber;
        cucumber = tomato;
        tomato = milk;

        System.out.println(cucumber);
        System.out.println(tomato);




        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        boolean isSame1 = !state1.equals(state2);
        System.out.println(isSame1);

        boolean isSame3 = state2.equalsIgnoreCase(state4);
        System.out.println(isSame3);

        boolean isSame4 = state3.equals(state5);
        System.out.println(isSame4);

        boolean isSame5 = state5.equals(state1);
        System.out.println(isSame5);

        boolean isSame6 = !state4.equals(state3);
        System.out.println(isSame6);








    }
}
