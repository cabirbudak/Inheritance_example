package Inheritance_homework02;

public class Motorcycle extends Vehicle{
    boolean hasSideCar;

    public Motorcycle(String make, String model, int year, boolean hasSideCar) {
        super(make, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle is stopping");
    }
}
