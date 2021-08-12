public class MethodCall {


        public static void main(String[] args) {

            int a = 6, b = 8;
            int m = min (a,b);
            System.out.println("Minimum is " + m);

        }

        public static int min(int c, int d) {
            int m1;
            if (c < d)
                 m1 = c;
            else
                m1 = d;

            return m1;

        }
}
