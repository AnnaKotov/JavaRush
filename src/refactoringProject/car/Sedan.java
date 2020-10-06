package refactoringProject.car;

public class Sedan extends Car {
   private int numberOfPassengers;

    public Sedan(int numberOfPassengers) {
        super(SEDAN,numberOfPassengers);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SEDAN_SPEED;
    }
}
