package switchStatement;

public class Weekdays {
    public static void main(String[] args) {

        int day = 5;

        switch (day){
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day input");

        }
    }
}
