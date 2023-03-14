package methodOverloading;

public class ArithmeticOperations {

    public int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public int sumOfNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public int averageOfNumbers(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }
    public int averageOfNumbers(int a, int b, int c, int d, int e, int f){
        return (a + b + c + d + e + f) / 4;
    }



    public double getAreaOfTriangle(int base, int height){
        double area = 0.5 * base * height;
        return area;
    }

    public double getAreaOfTriangle(int a, int b, int c){
        int s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }



    public static void main(String[] args) {
        ArithmeticOperations user = new ArithmeticOperations();
        System.out.println(user.getAreaOfTriangle(5,5));
        System.out.println(user.getAreaOfTriangle(2,2,2));
    }
}
