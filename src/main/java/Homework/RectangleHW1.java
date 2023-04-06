package Homework;

public class RectangleHW1 {

    double length;
    double width;

    public RectangleHW1(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void displayRectangleInfo(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of rectangle: " + getArea());
        System.out.println("Perimeter of rectangle: " + getPerimeter());
    }

    public static void main(String[] args) {
        RectangleHW1 one = new RectangleHW1(3, 5);
        one.displayRectangleInfo();
        System.out.println();
        double newLength = 4;
        double newWidth = 2;
        one.setLength(newLength);
        one.setWidth(newWidth);
        one.displayRectangleInfo();
    }
}
