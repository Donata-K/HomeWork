package com.teorija;


public abstract class Car {
    private static final String PETROL = "petrol";
    private static final String DIESEL = "diesel";
    static String carMake = "Mini";
    static String carModel = "Cooper";

    public String fuelType;


    public Car(String make, String model, String fuelType) {
        this.carMake = make;
        this.carModel = model;
        this.fuelType = fuelType;
    }


    public Car(String fuelType) {

        this.fuelType = fuelType;
    }

    public String getFuelType(String fuelType) {
        return PETROL;
    }

}