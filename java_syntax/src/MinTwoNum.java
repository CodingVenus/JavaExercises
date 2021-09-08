public class MinTwoNum {

    public static void main(String[] args) throws Exception {
        System.out.println(min(34, 34));
    }

    public static int min(int a, int b) {
        int m;

        if (a < b) {
            m = a;
        } else {
            m = b;
        }
        return m;

    }

}
