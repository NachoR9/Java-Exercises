package dev.nacho.vehicle;

public class CarApplication {
    public static void main(String[] args) {
     Car car = new Car("Ferrari", 2020, 5, Fuel.DIESEL, CarType.EXECUTIVE, 5, 5, 200, Color.VIOLET, 100);
     car.accelerate(20);
     System.out.println("Current speed is " + car.getCurrentSpeed());
     car.decelerate(50);
     System.out.println("Current speed is " + car.getCurrentSpeed());
     car.brake();
     System.out.println("Current speed is " + car.getCurrentSpeed());

    }
}
