package refactoringProject.car;

public class Truck extends Car {
    private int numberOfPassengers;
    public Truck(int numberOfPassengers) {
        super(TRUCK,numberOfPassengers);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
