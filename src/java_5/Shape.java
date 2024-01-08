package java_5;

public abstract class Shape {
    private Shape next;
    public Shape() {
        next = null;
    }
    public void setNext(Shape obj) {
        next = obj;
    }
    public Shape getNext() {
        return next;
    }
    public abstract void draw();
}

class Line extends Shape{
    public Line(){}
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public Rect(){}
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public Circle(){}
    public void draw(){
        System.out.println("Circle");
    }
}
