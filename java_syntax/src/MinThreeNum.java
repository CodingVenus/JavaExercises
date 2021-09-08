public class MinThreeNum {
    public static void main(String [] args) {
        System.out.println(min(19,14,15));
    }

    public static int min(int a, int b, int c) {
        int m;

        if (a < b) {
            m = a;
        } else if (b < c) {
            m = b;
        } else {
            m = c;
        }

        return m;
    }

}
