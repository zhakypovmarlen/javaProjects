package arithmeticOperators;

public class CompoundOperators {

    public static void main (String [] args){

        int a = 5;
        a++;    // a = a + 1
        System.out.println(a);

        a--; // a = a - 1
        System.out.println(a);

        int age = 18;
        System.out.println(age);
        System.out.println(age++);    // post increment
        System.out.println(age);

        int price = 20;
        System.out.println(++price);   // pre increment


        int money = 20;
        money += 3;
        System.out.println(money);




    }
}
