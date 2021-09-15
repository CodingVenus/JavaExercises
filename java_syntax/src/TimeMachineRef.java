public class TimeMachineRef {

    public void goToTheFuture (CatRef catR) {
        catR.age += 100;
    }

    public void goToPast (CatRef catR) {
        catR.age -= 10;
    }

    public static void main (String [] args) {

        TimeMachineRef timeMachineR = new TimeMachineRef();
        CatRef smudge = new CatRef(5);

        //since reference to original smudge object was passed, it affects the object
        System.out.println(smudge.age);

        timeMachineR.goToPast(smudge);
        System.out.println(smudge.age);

        timeMachineR.goToTheFuture(smudge);
        System.out.println(smudge.age);

    }
}

