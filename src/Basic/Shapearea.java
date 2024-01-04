package Basic;
abstract class Shape {
    abstract double area();
    void print() {
        System.out.println("Area of method");
    }
}
class Rectangle extends Shape {
    double length,width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
class Triangle extends Shape {
    double base,height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return 0.5 * base * height;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}
public class Shapearea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.0d, 3.0d);
        Triangle t = new Triangle(4, 6);
        Circle c = new Circle(7);
        r.print();
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Area of Circle: " + c.area());
    }
}