public class ParkingTester {
    public static void main(String[] args){
        ParkingLot mainParkingLot = new ParkingLot();

        System.out.println(mainParkingLot);

        Car infinittiA = new Car("A", "Infinitti", true );
        mainParkingLot.ParkCar(infinittiA);
        System.out.println(mainParkingLot);

        Car cadillacB = new Car("B", "Cadillac", false);
        mainParkingLot.ParkCar(cadillacB);
        System.out.println(mainParkingLot);

        mainParkingLot.removeCar(0);
        System.out.println(mainParkingLot);

    }
    
}
