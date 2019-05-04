package com.factory;

import com.otostore.Car;
import com.otostore.com.ototstore.impl.Civic;
import com.otostore.com.ototstore.impl.Corolla;

public class CarFactory {


    public Car carCreator(String carType) {

        Car car = null;

        if ("civic".equals(carType)) {
            car = new Civic();
        } else if ("corolla".equals(carType)) {
            car = new Corolla();
        } else {
            System.out.println("invalid parameter entered.");
        }

        return car;

    }

}
