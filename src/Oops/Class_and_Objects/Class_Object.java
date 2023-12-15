package Oops.Class_and_Objects;

class car{
    String make;
    String model;
    int year;

    void start(){
        System.out.println("Car is running");
    }

    void stop(){
        System.out.println("Car in stopped");
    }
}
public class Class_Object {
    car newCar=new car();
}
