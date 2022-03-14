package tredu.maltepe.oop;


public class Student extends Person {
    public String std_name;
    Student(String name){
        std_name=name;
    }
    public void learns(){
    System.out.println("Student Name : "+std_name);
    }
}
