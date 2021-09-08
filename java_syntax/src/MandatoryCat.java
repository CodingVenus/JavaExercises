public class MandatoryCat {
    String name;
    int age;

    //Constructor
    public MandatoryCat(String constructorName, int constructorAge) {
        this.name = constructorName;
        this.age = constructorAge;
    }

    public static void main(String [] args) {

        MandatoryCat nyankoSensei =new  MandatoryCat("RED", 13);

        System.out.println(nyankoSensei.name + " " + nyankoSensei.age);
    }
}
