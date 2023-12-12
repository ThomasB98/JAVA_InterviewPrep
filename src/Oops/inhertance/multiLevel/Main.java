package Oops.inhertance.multiLevel;

class A{
    public void method_A(){
        System.out.println("Im method of class A");
    }
}

class B extends A{
    public void method_B(){
        System.out.println("Im method of class B");
    }
}

public class Main extends B {
    public static void main(String[] args) {
        Main m=new Main();
        m.method_A();
        m.method_B();
        m.method_main();
    }

    public void method_main(){
        System.out.println("=====================");
        super.method_A();
    }
}
