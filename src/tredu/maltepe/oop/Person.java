package tredu.maltepe.oop;

public class Person {
    private String gender;
    Person(String GND){
        gender = GND;
    }

    public Person() {
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }


    public void ShowGender(){

        System.out.println("Gender of the Person:"+gender);

    }

}
