package com.teorija;


        public class DieselCar extends Car {

            private static final String DIESEL = "diesel";



            public DieselCar(String fuelType) {
                super(fuelType);
            }

            @Override
            public String getFuelType(String fuelType) {
                return DIESEL;
            }


        }



