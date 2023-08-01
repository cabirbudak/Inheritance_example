package Inheritance_homework02;

public class Main {
    public static void main(String[] args) {
        Car car = new Car ("bmw", "325i",2015, 4);
        Truck truck = new Truck("mercedes","G550",2022,7.115);
        Motorcycle motorcycle = new Motorcycle("yamaha","R1",2019,true);

        System.out.println("Car has : " + car.getNumDoors() + " doors");
        car.start();
        System.out.println("Motorcycle Model is: " + motorcycle.getModel());
        motorcycle.stop();
        System.out.println("Truck Model is: " + truck.getModel());
        truck.start();
        truck.stop();
    }
}
