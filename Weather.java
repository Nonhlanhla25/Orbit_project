package Orbit;

import java.util.Objects;
public class Weather{
    private String condition;

    public Weather(String condition){
        this.condition= condition;
    }

    //calculate the weather conditons
    public double calculateCraters(int craters) {

        if (condition.equals("sunny")) {
            return craters - (craters * 0.1);
        } else if(condition.equals("rainy")) {
            return craters + (craters * 0.2);
        } else  {
            return craters;
        }
    }
}



