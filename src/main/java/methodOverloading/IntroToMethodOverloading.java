package methodOverloading;

public class IntroToMethodOverloading {

    /*
    --method name must be unique. We cannot have two or more methods to use the same name.
    --when two or more methods have exactly same signature but different number or types of parameter,
     it is called method overloading.


     */
    public int getAreaOfRectangle(int length, int width) {
        return length * width;
    }

    public int getAreaOfRectangle(long length, long width) {
        return (int) (length * width);
    }

    public int getAreaOfRectangle(double length, double width) {
        return (int) (length * width);
    }


    public int getPerimeterOfSquare(int a) {
        return 4 * a;
    }

    public int getPerimeterOfSquare(long a) {
        return (int) a * 4;
    }

    public int getPerimeterOfSquare(double a) {
        return (int) a * 4;
    }



}
