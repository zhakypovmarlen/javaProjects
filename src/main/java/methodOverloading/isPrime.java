package methodOverloading;

public class isPrime {

    public boolean isItPrime(int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isItPrime(short a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isItPrime(long a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPrime user = new isPrime();
        System.out.println(user.isItPrime(15));
        System.out.println(user.isItPrime(155));
    }


}
