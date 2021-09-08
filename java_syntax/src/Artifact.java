public class Artifact {

    // Write your code here
    int serialNum;
    String culture;
    int century;

    public Artifact(int serialNum){
        this.serialNum = serialNum;
    }
    public Artifact(int serialNum, String culture){
        this.serialNum = serialNum;
        this.culture = culture;

    }
    public Artifact(int serialNum, String culture, int century) {
        this.serialNum = serialNum;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        // Write your code here
        Artifact type1 = new Artifact(12345);
        Artifact type2 = new Artifact(65432, "Persian");
        Artifact type3 = new Artifact ( 87654, "Aztec", 3);


    }
}
