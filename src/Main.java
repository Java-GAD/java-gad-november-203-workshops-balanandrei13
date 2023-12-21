public class Main {
    public static void main(String[] args) {
        Car car= new Car(4,"V8");
        Moto moto= new Moto(2,"SuperGT");
        Vehicles vehicle=new Vehicles(3,"Normal");

        vehicle.trick();
        moto.trick();
        car.trick();
        trick(car);
        trick(moto);
        trick(vehicle);
    }
    public static void trick(Vehicles v){
        v.trick();
    }
}