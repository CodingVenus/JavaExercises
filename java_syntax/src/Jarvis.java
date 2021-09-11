

public class Jarvis {

    public void sayHi(String name) {
        System.out.println("Good evening, " + name + ". How are you?");
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Tony Stark");
    }
}