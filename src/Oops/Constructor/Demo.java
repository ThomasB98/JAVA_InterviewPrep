package Oops.Constructor;

class add{
    int a=10;
    int b=20;

    public add(int a,int b){
        this.a=a;
        this.b=b;
    }

    public add() {
        int a=10;
        int b=20;
    }
}
public class Demo {

    public static void main(String[] args) {
        add obj1=new add(30,40);

        add obj2=new add();
        add obj3=new add(50,60);

        System.out.println(obj1.a+obj2.b+obj3.b+obj3.a);

        System.out.println("==========================");
        System.out.println(obj1.a+" object 1.a");
        System.out.println(obj1.b+" object 1.b");

        System.out.println(obj2.a+" object 2.a");
        System.out.println(obj2.b+" object 2.b");

        System.out.println(obj3.a+" object 3.a");
        System.out.println(obj3.b+" object 3.b");
    }

}
