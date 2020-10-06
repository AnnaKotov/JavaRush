package refactoringProject.car;

public class Cabriolet extends Car{
    private int numberOfPassengers;

    public Cabriolet(int numberOfPassengers) {
        super(CABRIOLET,numberOfPassengers);
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
