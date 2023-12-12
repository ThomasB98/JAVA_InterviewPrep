package Oops.inhertance.Hierarchical;

class A{
    public void method_A(){
        System.out.println("Method of A");
    }
}

class B extends A{
    public void method_B(){
        System.out.println("Method of B");
        super.method_A();
    }
}

class C extends A{
    public void method_C(){
        System.out.println("Method of C");
        super.method_A();
    }
}


public class Main {
    public static void main(String[] args) {
        C c=new C();
        c.method_C();
        B b=new B();
        b.method_B();
    }
}
