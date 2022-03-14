package tredu.maltepe.oop;

public class Person {
    public String Gender;
    Person(String GND){
        Gender = GND;
    }

    public Person() {
    }

    public void ShowGender(){

        System.out.println("Gender of the Person:"+Gender);

    }

}
