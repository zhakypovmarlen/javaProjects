package Constructors;

public class Rectangle {

    int length;
    int width;


    public Rectangle(){
        length = 1;
        width = 1;
    }
    public Rectangle(int length1, int width1){
        length = length1;
        width = width1;
    }

    public Rectangle(int a){
        length = a;
        width = a;
    }

    public int AreaOfRectangle(){
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.length = 4;
        rec1.width = 3;

    }
}
