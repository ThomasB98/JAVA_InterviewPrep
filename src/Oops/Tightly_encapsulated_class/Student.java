package Oops.Tightly_encapsulated_class;


//Student class is Tightly_encapsulated_class
//because every data member is private
public class Student {
    private String name;
    private int age;
    private String studentId;

    //getters
    public String getName() {
        return name;
    }

    public int getage(){
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    //setters
    public void setName(String Name){
        this.name=Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
