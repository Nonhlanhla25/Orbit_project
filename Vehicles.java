package Orbit;

public class Vehicles{
    private String name;
    private int speed;
    private int minutes;
    Vehicles(String name, int speed, int minutes){
        this.name = name;
        this.speed = speed;
        this.minutes = minutes;
    }
    
    public int getSpeed() {
        return speed;
    }

    public int getMinutes() {
        return minutes;
    }

    /**
     * calculate distance of the orbit
     * calculate time it takes to cross the orbit
     * adjust number of craters based on the weather conditions
     */
    public double orbitTravelTime(int megamiles, double adjustedCraters, Vehicles vehicles) {
        double timeToTravelMegaMiles = (double) megamiles / vehicles.getSpeed();
        double timeToCrossCraters = adjustedCraters * ((double) vehicles.getMinutes()/60 );
        return timeToTravelMegaMiles + timeToCrossCraters;
    }




}
