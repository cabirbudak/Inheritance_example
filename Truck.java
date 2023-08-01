package Inheritance_homework02;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String make, String model, int year, double cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    void start() {
        System.out.println("Truck is starting");
    }

    @Override
    void stop() {
        System.out.println("Truck is stopping");
    }
}
