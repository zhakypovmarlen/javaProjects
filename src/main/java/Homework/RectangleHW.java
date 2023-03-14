package Homework;

public class RectangleHW {

    int width;
    int height;

    public void calculateArea(){
        System.out.println("The area of rectangle is: " + (width * height));
    }

    public void calculatePerimeter(){
        System.out.println("The perimeter of rectangle is: " + (2 * (width + height)));
    }

    public static void main(String[] args) {
        RectangleHW rectangle = new RectangleHW();
        rectangle.width = 6;
        rectangle.height= 6;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
