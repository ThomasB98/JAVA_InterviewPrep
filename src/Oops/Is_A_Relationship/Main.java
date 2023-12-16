package Oops.Is_A_Relationship;


class p{
    public void m1(){
        System.out.println("parents");
    }
}

class c extends p{
    public void m2(){
        System.out.println("child");
    }
}
public class Main {
    public static void main(String[] args) {
       p p=new p();
       p.m1();

       c c=new c();
       c.m2();
       c.m1();

       p p1=new c();
       p1.m1();

       //p1.m2(); is not allowed
        // c c1=new p(); is not allowed

    }
}
