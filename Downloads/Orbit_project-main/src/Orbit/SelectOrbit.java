package Orbit;

public class SelectOrbit {
    String chooseOrbit;
    String chooseVehicle;

    public SelectOrbit() {
        chooseOrbit = "";
        chooseVehicle = "";
    }

    //determines the shortest travel time between two orbit and vehicles
    public void calculateOrbitAndVehicle(double minTime1, double minTime2, double timeTakesOrbit1Bike1,
                                         double timeTakesOrbit1Tuktuk1, double timeTakesOrbit1Car1,
                                         double timeTakesOrbit2Bike2, double timeTakesOrbit2Tuktuk2,
                                         double timeTakesOrbit2Car2, String conditions) {

        if(minTime1 < minTime2 ) {
            chooseOrbit = "Orbit1";
            if ((minTime1 == timeTakesOrbit1Bike1) && !conditions.equals("rainy")) {
                chooseVehicle = "Bike";
            } else if (minTime1 == timeTakesOrbit1Tuktuk1) {
                chooseVehicle = "Tuktuk";
            } else if (minTime1 == timeTakesOrbit1Car1) {
                chooseVehicle = "car";
            }
        } else if (minTime2 < minTime1) {
            chooseOrbit = "Orbit2";
            if((minTime2 == timeTakesOrbit2Bike2) && !conditions.equals("rainy")) {
                chooseVehicle = "Bike";
            } else if (minTime2 == timeTakesOrbit2Tuktuk2) {
                chooseVehicle = "Tuktuk";
            } else if (minTime2 == timeTakesOrbit2Car2) {
                chooseVehicle = "car";
            }
        } else {
            chooseOrbit = "Orbit1";
            if (!conditions.equals("rainy")) {
                chooseVehicle = "Bike";
            } else {
                chooseVehicle = "Tuktuk";
            }
        }
    }

    public void printResults(double orbiTtMegamiles1, double orbiTtMegamiles2, String conditions) {
        System.out.println("Weather is " + conditions);
        System.out.println("Orbit1 is traffic speed is " + orbiTtMegamiles1 + " megamile/hour");
        System.out.println("Orbit2 is traffic speed is " + orbiTtMegamiles2 + " megamile/hour");
        System.out.println("Vehicle " + chooseVehicle + " on " + chooseOrbit);
    }
}




