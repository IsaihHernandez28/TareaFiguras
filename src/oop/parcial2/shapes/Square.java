package oop.parcial2.shapes;

public class Square extends Shape{
    private int side;
    public Square(int side){
        this.side = side;
    }
    public double getArea(){
        double area = 0;

        area = side^2;

        return area;
    }
    public double getPerimeter(){
        double perimeter = 0;

        perimeter = side * 4;

        return perimeter;
    }
}
