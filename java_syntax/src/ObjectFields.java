public class ObjectFields {
    String name;
    int age;

    public static void main (String[] args) {
        ObjectFields person = new ObjectFields();
        person.name = "Iris";
        person.age = 14;

        System.out.println("I have created a person named " + person.name + ". Their age is " + person.age + ".");
    }
}
