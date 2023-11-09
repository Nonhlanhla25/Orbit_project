package Orbit;

import java.util.Objects;
public class Weather{
    private String condition;

    public Weather(String condition){
        this.condition= condition;
    }

    public String getCondition() {
        return condition;
    }

    //calculate the weather conditons
    public double calculateCraters(int craters) {

        if (getCondition().equals("sunny")) {
            return craters - (craters * 0.1);
        } else if(getCondition().equals("rainy")) {
            return craters + (craters * 0.2);
        } else  {
            return craters;
        }
    }

}



