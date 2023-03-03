package oop.parcial2.shapes;

public class Circle extends Shape{
    private int radio;
    public static int pi = (int) 3.1416;
    public Circle(int radio){
        this.radio = radio;
    }
    public double getArea(){
        double area = 0;
        area = pi * radio^2;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 0;

        perimeter = pi * (2*radio);

        return perimeter;
    }
}
