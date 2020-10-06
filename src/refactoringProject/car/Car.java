package refactoringProject.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    static public final int MAX_TRUCK_SPEED = 80;
    static public final int MAX_SEDAN_SPEED = 120;
    static public final int MAX_CABRIOLET_SPEED = 90;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car( int type, int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers){
        switch (type){
            case TRUCK: return new Truck(numberOfPassengers);

            case  SEDAN: return new Sedan(numberOfPassengers);

            case CABRIOLET: return new Cabriolet(numberOfPassengers);

        }
        return null;
    }

    public void fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0)
            throw new Exception("Empty tank");
        fuel += numberOfLiters;

    }
    public boolean isSummer(Date date, Date summerStart, Date summerEnd){
        if(date.before(summerStart) || date.after(summerEnd)){
            return false;
        }
        return true;
    }

    public double getWinterConsumption(int length){
        double consumption = length * winterFuelConsumption + winterWarmingUp;
        return consumption;
    }

    public double getSummerConsumption(int length){
        double  consumption = length * summerFuelConsumption;
        return consumption;
    }

    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        double consumption;
        if(isSummer(date,SummerStart,SummerEnd)){
            consumption = getSummerConsumption(length);
        }else {consumption = getWinterConsumption(length);}
        return consumption;
    }

    private boolean canPassengersBeTransferred(){
        if(isDriverAvailable() && fuel > 0){
            return true;
        }
        return false;
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if(canPassengersBeTransferred())return numberOfPassengers;
        return 0;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        fastenDriverBelt();
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();
}