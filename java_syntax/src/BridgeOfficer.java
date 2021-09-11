
public class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public boolean checkTruck(Truck truck) {
        if (truck.weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String [] args) {

        Truck truck1 = new Truck(3000);


        Truck truck2 = new Truck(45000);

        BridgeOfficer officer = new BridgeOfficer(15000);

        boolean isTruckOk = officer.checkTruck(truck1);
        System.out.println(isTruckOk);

        boolean isTruckOk2 = officer.checkTruck(truck2);
        System.out.println(isTruckOk2);
    }

}