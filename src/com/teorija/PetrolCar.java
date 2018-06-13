package com.teorija;

 public class PetrolCar extends Car {
  private static final String PETROL = "petrol";

  public PetrolCar(String fuelType) {
   super(fuelType);
  }


  @Override
  public String getFuelType(String fuelType) {
   return PETROL;
  }


  }

