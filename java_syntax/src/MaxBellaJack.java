public class MaxBellaJack {
    public static void main(String[] args ) {
       //Create a reference variable dog and new Dog object.
        // Assign the reference to the new Dog object into the reference variable dog1
        Dog dog1 = new Dog();

        //Assign dog object a name
        dog1.name = "Max";

        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
