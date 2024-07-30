package Assignment02.Question02;

// Vehicle.java
class Vehicle {
    protected String name;
    protected double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " is moving at a speed of " + speed + " km/h.");
    }
}

// Car.java
class Car extends Vehicle {
    private int doors;

    public Car(String name, double speed, int doors) {
        super(name, speed);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(name + " (Car) is cruising at a speed of " + speed + " km/h.");
    }
}

// Truck.java
class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String name, double speed, double cargoCapacity) {
        super(name, speed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void move() {
        System.out.println(name + " (Truck) is hauling cargo at a speed of " + speed + " km/h.");
    }
}

// Bike.java
class Bike extends Vehicle {
    private boolean hasGears;

    public Bike(String name, double speed, boolean hasGears) {
        super(name, speed);
        this.hasGears = hasGears;
    }

    @Override
    public void move() {
        System.out.println(name + " (Bike) is pedaling at a speed of " + speed + " km/h.");
    }
}

// AutomotiveSystemApp.java (Main class)
public class AutomotiveSystemApp {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Car car = new Car("Toyota Camry", 120.0, 4);
        Truck truck = new Truck("Ford F-150", 80.0, 5000.0);
        Bike bike = new Bike("Mountain Bike", 25.0, true);

        // Demonstrate polymorphism
        Vehicle[] vehicles = {car, truck, bike};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}

