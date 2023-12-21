public class Moto extends Vehicles{

    public Moto(int wheels, String engine) {
        super(wheels, engine);
    }
    @Override
    public void trick() {
        System.out.println("You did a wheelie!");
    }
}
