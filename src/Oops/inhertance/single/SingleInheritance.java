package Oops.inhertance.single;

class parent{
    int a;
    void set_a(int x){
        a=x;
        System.out.println(a);
    }
}
public class SingleInheritance extends parent {
    int b;
    void set_B(int x){
        b=x+1;
        System.out.println(b);
    }

    public static void main(String[] args) {
        SingleInheritance b=new SingleInheritance();
        b.set_B(5);
        b.set_a(5);
    }
}
