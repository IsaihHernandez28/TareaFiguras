package oop.parcial2.shapes;

public class Rectangle extends Shape{
    private int base;
    private int height;
    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        double area = 0;

        area = base * height;

        return area;
    }
    public double getPerimeter(){
        double perimeter = 0;

        perimeter = (base*2) + (height*2);

        return perimeter;
    }
}
