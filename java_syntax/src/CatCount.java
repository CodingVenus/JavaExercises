import javax.xml.namespace.QName;

public class CatCount {

    String name;
    int age;

    static int count = 0;

    public CatCount() {
        count++;
        this.name = "This is No. " + count;

    }

    public CatCount(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main (String[] args) {
        CatCount streetCat1 = new CatCount();
        CatCount streetCat2 = new CatCount();
        CatCount streetCat3 = new CatCount();

        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
        System.out.println(streetCat3.name);

    }

}