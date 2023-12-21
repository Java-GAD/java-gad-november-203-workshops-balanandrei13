public class  Vehicles {
    private int wheels;
    private String engine;

    public Vehicles(int wheels, String engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void trick(){
        System.out.println("You did a random trick!");
    }
}



