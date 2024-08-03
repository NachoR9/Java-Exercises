package dev.nacho.vehicle;

public class Car {
    private String brand;
    private int model;
    private int engine;
    private Fuel typeFuel;
    private CarType carType;
    private int doorsNumber;
    private int seatsNumber;
    private int maximumSpeed;
    private Color color;
    private int currentSpeed;
    private boolean automatic;

   
    public Car(String brand, int model, int engine, Fuel typeFuel, CarType carType, int doorsNumber, int seatsNumber,
            int maximumSpeed, Color color, int currentSpeed, boolean automatic) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.typeFuel = typeFuel;
        this.carType = carType;
        this.doorsNumber = doorsNumber;
        this.seatsNumber = seatsNumber;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.automatic = automatic;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public Fuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(Fuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void accelerate(int speed) {
        if (currentSpeed + speed > maximumSpeed) {
            System.out.println("The car has exceeded the limit speed");
            return;
        }
        this.currentSpeed = currentSpeed + speed;
    }

    public void decelerate(int speed) {
        if (currentSpeed - speed < 0) {
            System.out.println("The car can not decelerate below 0 km/h");
            return;
        }
        this.currentSpeed = currentSpeed - speed;
    }

    public void brake() {
        currentSpeed = 0;
    }

    public int arrivalTime(int distance) {
        int estimatedTime = distance / currentSpeed;
        return estimatedTime;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", engine=" + engine + ", typeFuel=" + typeFuel
                + ", carType=" + carType + ", doorsNumber=" + doorsNumber + ", seatsNumber=" + seatsNumber
                + ", maximumSpeed=" + maximumSpeed + ", color=" + color + ", currentSpeed=" + currentSpeed + "]";
    }

    

}
