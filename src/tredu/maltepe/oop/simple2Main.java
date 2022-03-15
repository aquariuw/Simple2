package tredu.maltepe.oop;

public class simple2Main {


        public static void main(String[] args){

            Professor p1,p2;
            Student s1,s2;
            Person per1;

            p1 = new Professor("Ensar Gül");
            p1.setGender("Male");
            System.out.println("Ensar Gül : " +p1.getGender());
            p2 = new Professor( "Raif hoca");
            p2.setGender("Male");
            System.out.println("Raif Hoca : "+p2.getGender());
            s1 = new Student("Abdurrahman");
            s1.setGender("Male");
            System.out.println("Abdurrahman : " +s1.getGender());
            s2 = new Student( "Utku") ;
            s2.setGender("Male");
            System.out.println("Utku Cinsiyet : "+s2.getGender());
            per1 = new Person("Male");
            per1.ShowGender();


            p1.teachs();
            p2.teachs();
            s1.learns();

            //comment

        }
    }


