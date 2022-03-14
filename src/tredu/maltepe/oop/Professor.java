package tredu.maltepe.oop;

public class Professor extends Person {
    String prof_name;
    Professor(String name){
        prof_name = name;
    }
    void teachs(){

        System.out.println("Professor Name:"+prof_name);

    }
}
