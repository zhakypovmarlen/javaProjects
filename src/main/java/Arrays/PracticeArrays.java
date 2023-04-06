package Arrays;

public class PracticeArrays {
    public static void main(String[] args) {

        String [] cities = {"Barcelona" , "Milan", "Capetown", "Tokyo","Sydney"};
        System.out.println(cities.length);

        System.out.println(cities[1]); //  Milan
        System.out.println(cities[2].startsWith("B")); // Capetown

        String capitalOfJapan = cities[3];
        System.out.println(capitalOfJapan);

        System.out.println("This summer I wanna go to " + cities[cities.length - 1]);

        String countries [] = {"Columbia" , "Turkey", "South Korea", "Switzerland", "Australia"};

        System.out.println("All the fruits come from " + countries[0]);
        System.out.println(countries[1] + "'s capital is Ankara");
        System.out.println(countries[countries.length - 3] + " is not same as North " + countries[2].substring(6));
        System.out.println(countries[3] + " has the best skiing resort");
        System.out.println(countries[4] + ", " + countries[4].substring(2) + ", " + countries[4].substring(4)
        + ", " + countries[4].substring(6) + ", " + countries[4].charAt(countries[4].length()-1));


        int [] numbers  = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            System.out.print(" ");
        }

    }
}
