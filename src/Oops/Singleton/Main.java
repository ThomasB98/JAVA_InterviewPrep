package Oops.Singleton;

public class Main {
    public static void main(String[] args) {
        Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();

        //How to create ourown singleton class
        Test t1=Test.getTest();
        Test t2=Test.getTest();
    }
}

//(we can create ourown singeton class for thi
// we hae to use private consturtor and private static variable
// and public facrtory method)
// Approch_1
class Test{
    private static Test t=new Test();
    private Test(){

    }

    public static Test getTest(){
        return t;
    }
}

//NOTE
//Runtime class is internaly implemted useing(Approch_1) this approch

//Approch_2
class Test1{
    private static Test1 t1=null;
    private Test1(){

    }

    public static Test1 getTest1(){
        if(t1==null){
            t1=new Test1();
        }
        return t1;
    }
}
// for any point of time we can only create one object
// Hence Test1 class is singleton class

