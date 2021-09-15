public class TimeMachine {

    public void goToFuture(int currentYear) {
        currentYear = currentYear+10;
    }

    public void goToPast(int currentYear) {
        currentYear = currentYear-10;
    }

    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2018;

        System.out.println("What year is it?");
        System.out.println(currentYear);

        //primitive variables in java are passed by value. A copy of the variable is made so the original value is unchanged.
        timeMachine.goToPast(2018));
        System.out.println("How about now?");
        System.out.println(currentYear);
    }
}