package Oops.inhertance.Multiple;

interface PI1{
    default void show(){
        System.out.println("Default PI1");
    }
}

interface PI2{
    default void show(){
        System.out.println("Default PI2");
    }
}

public class TestClass implements PI1,PI2 {
    public static void main(String[] args) {
        TestClass d=new TestClass();
        d.show();
        d.showOfPI1();
        d.showOfPI2();
    }

    @Override
    public void show() {
        PI1.super.show();
        PI2.super.show();
    }

    public void showOfPI1() {
        PI1.super.show();
    }
    public void showOfPI2() {
        PI2.super.show();
    }
}
