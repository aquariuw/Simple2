package tredu.maltepe.oop;

public class simple2Main {


        public static void main(String[] args){

            Professor p1,p2;
            Student s1;

            p1 = new Professor("Ensar Gül");
            p1.setGender("Male");
            p1.getGender();
            p2 = new Professor( "Raif hoca");
            p2.setGender("Male");
            p2.getGender();
            s1 = new Student("Abdurrahman");
            s1.setGender("Male");
            s1.getGender();
            p1.teachs();
            p1.ShowGender();
            p2.teachs();
            p2.ShowGender();
            s1.learns();
            s1.ShowGender();
            //comment

        }
    }


