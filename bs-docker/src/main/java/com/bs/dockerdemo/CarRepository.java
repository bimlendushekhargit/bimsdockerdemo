package com.bs.dockerdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {

	public List<Car> findCars() {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("A4", "Audi", 65000));
		cars.add(new Car("TT", "Audi", 155000));
		cars.add(new Car("CLA", "Mercedes-Benz", 85000));
		cars.add(new Car("Compass", "Jeep", 45000));

		return cars;

	}

}
