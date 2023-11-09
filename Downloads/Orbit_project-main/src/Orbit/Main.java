package Orbit;

import java.util.Scanner;

public class Main {
    static int orbiTtMegamiles1;
    static int orbiTtMegamiles2;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Vehicles bike = new Vehicles("bike",10,2);
        Vehicles tuktuk = new Vehicles("tuktuk",12,1);
        Vehicles car = new Vehicles("car",20,3);

        System.out.println("Enter weather conditions");
        String conditions = scanner.nextLine();

        System.out.println("Enter the first Orbit1 traffic speed");
        orbiTtMegamiles1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second Orbit2 traffic speed");
        orbiTtMegamiles2 = Integer.parseInt(scanner.nextLine());

        Weather weather = new Weather(conditions);

        Orbit orbit1 = new Orbit(18,20, weather);
        Orbit orbit2 = new Orbit(20,10,weather);

        double timeTakesOrbit1Bike1 = bike.orbitTravelTime(orbiTtMegamiles1,orbit1.calCraters(), bike);
        double timeTakesOrbit1Tuktuk1 = tuktuk.orbitTravelTime(orbiTtMegamiles1,orbit1.calCraters(), tuktuk);
        double timeTakesOrbit1Car1 = car.orbitTravelTime(orbiTtMegamiles1,orbit1.calCraters(), car);

        double timeTakesOrbit2Bike2 =bike.orbitTravelTime(orbiTtMegamiles2,orbit2.calCraters(), bike);
        double timeTakesOrbit2Tuktuk2 = tuktuk.orbitTravelTime(orbiTtMegamiles2,orbit2.calCraters(), tuktuk);
        double timeTakesOrbit2Car2 = car.orbitTravelTime(orbiTtMegamiles2,orbit2.calCraters(), car);

        double minTime1 = Math.min(timeTakesOrbit1Bike1, Math.min(timeTakesOrbit1Tuktuk1, timeTakesOrbit1Car1));
        double minTime2 = Math.min(timeTakesOrbit2Bike2, Math.min(timeTakesOrbit2Tuktuk2, timeTakesOrbit2Car2));

        SelectOrbit selectOrbit = new SelectOrbit();

        selectOrbit.calculateOrbitAndVehicle(minTime1, minTime2, timeTakesOrbit1Bike1,
                timeTakesOrbit1Tuktuk1, timeTakesOrbit1Car1, timeTakesOrbit2Bike2,
                timeTakesOrbit2Tuktuk2, timeTakesOrbit2Car2, conditions);

        selectOrbit.printResults(orbiTtMegamiles1, orbiTtMegamiles2, conditions);

    }

}