public class Car extends Vehicles{
    public Car(int wheels, String engine) {
        super(wheels, engine);
    }

    @Override
    public void trick() {
        System.out.println("You did a drift!");
    }
}
