package Orbit;

public class Orbit {
    private int megaMiles;
    private int craters;
    public Weather weather;
    public Orbit(int megaMiles, int craters, Weather weather) {
        this.megaMiles = megaMiles;
        this.craters = craters;
        this.weather = weather;
    }
    public int getMegaMiles() {
        return this.megaMiles;
    }
    public int getCraters() {
        return this.craters;
    }

    //calculate the affected number of craters in an orbit
    public double calCraters(){
        return weather.calculateCraters(getCraters());
    }

}

