public class User {
       String name;
       short age;
       int height;

       public static void main (String[] args ) {
           User user = new User( 13, "Sean", (short)03);

       }

       public User(String name, short age, int height) {
           this.name = name;
           this.age = age;
           this.height = height;
       }

       public User(String name, int height, short age) {
           this.name = name;
           this.age = age;
           this.height = height;
       }

       public User(short age, String name, int height) {
           this.name = name;
           this.age = age;
           this.height = height;
       }

       public User(short age, int height, String name) {
           this.name = name;
           this.age = age;
           this.height = height;
       }

       public User(int height, short age, String name) {
           this.name = name;
           this.age = age;
           this.height = height;
       }

       public User(int height, String name, short age) {
           this.name = name;
           this.age = age;
           this.height = height;
       }


   }
