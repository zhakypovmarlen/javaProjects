package Homework;

public class Shape {

    public int area(int radius){
        return (int)(3.14 * radius * radius);
    }

    public int area(int length, int width){
        return length * width;
    }

    public int area(double base, int height){
        return (int)(0.5 * base * height);
    }
}
