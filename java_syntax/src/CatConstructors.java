public class CatConstructors {
    String name;
    int age;

    public CatConstructors(String name, int age) {
        this.age = age;
        this.name = name;

    }

    public static void main (String[] args) {
        CatConstructors cat1 = new CatConstructors("Dorry", 13);
        System.out.println(cat1.name + " " + cat1.age);
    }
}
