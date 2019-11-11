/**
 * 
 */
package com.bs.dockerdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BS071957
 *
 */
@RestController
@RequestMapping("/bsws")
public class BSDockerDemoController {

	@Autowired
	private CarRepository carRepo;

	
	@RequestMapping("/cars")
	public List<Car> getCar() {
		return carRepo.findCars();
	}

}
