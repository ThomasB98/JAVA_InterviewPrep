package Oops.Abstraction;
// example demonstrating abstraction in Java
// using abstract classes and methods:

abstract class shape{
    public abstract void draw();

    public void dispaly(){
        System.out.println("This is a shape");
    }
}

class rectangle extends shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class circle extends shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
public class Main {
    public static void main(String[] args) {
        rectangle rec=new rectangle();
        rec.draw();
        circle cir=new circle();
        cir.draw();
    }
}
