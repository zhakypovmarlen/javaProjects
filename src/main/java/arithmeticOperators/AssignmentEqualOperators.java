package arithmeticOperators;

public class AssignmentEqualOperators {

    public static void main (String [] args){

        /* = assignment operator
           == equal equal operator (compares two variables if they are equal)
           != not equal operator (compares if two variable are not equal)
        */

        int number1 = 10; // assignment
        int number2 = 8;
        System.out.println(number1 == number2); // false
        System.out.println(100 == 100); // true

        boolean isEqual = 100 == 101;
        System.out.println(isEqual);

        boolean isNotEqual = 100 != 101;
        System.out.println(isNotEqual);

        boolean isDivisible;
        isDivisible = 80 % 2 == 0; // divisible
        System.out.println(isDivisible); // true

        boolean isEven;
        isEven = 4 % 3 == 0;
        System.out.println(isEven);







    }
}
