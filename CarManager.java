public class CarManager {
    public static void main(String[] args) {
        Car dogCar = new Car();

        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        
        dogCar.breakDowm();
        System.out.println(dogCar.getCurrentSpeed());
        
    }
}