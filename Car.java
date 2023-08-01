package Inheritance_homework02;

    class Car extends Vehicle{
    static int numDoors;

        public Car(String make, String model, int year, int numDoors) {
            super(make, model, year);
            this.numDoors = numDoors;
        }

        public int getNumDoors() {
            return 4;
        }
        @Override
        void start() {
            System.out.println("Vehicle is starting");
        }

        @Override
        void stop() {
            System.out.println("Vehicle is stopping");
        }
    }
