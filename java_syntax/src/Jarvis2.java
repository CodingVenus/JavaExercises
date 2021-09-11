import java.sql.SQLOutput;
import java.text.Format;

public class Jarvis2 {

     public void sayHi(String...names) {

         for (String name : names) {
             System.out.println("Hey " + name + ".");

         }
     }

     public static void main (String[] args) {
         Jarvis2 jarvis2 = new Jarvis2();

         jarvis2.sayHi("Red", "Yellow", "Blue", "Orange");

     }

//    public void sayHi(String...names) {
//
//        for (String name : names) {
//            System.out.println("good evening, " + name + ". How are you?");
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//            Jarvis2 jarvis2 = new Jarvis2();
//            jarvis2.sayHi("Ray","Tom","Diana","Ofe","Esco");
//        }
    }

