package oop.parcial2.shapes;

public class Triangle extends Shape{
    private int base;
    private int height;
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        double area = 0;

        area = (base * height) / 2;

        return area;
    }
    public double getPerimeter(){
        double perimeter = 0;

        perimeter = base + (height*2);

        return perimeter;
    }
}
