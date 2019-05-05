package com.client;

import com.factory.CarFactory;
import com.otostore.Car;

public class Client {

	public void clientRequest(String carType) {

		Car car = new CarFactory().carCreator(carType);
		car.brake();

	}
}
