/**
 * 
 */
package com.bs.dockerdemo;

/**
 * @author BS071957
 *
 */
public class Car {

	private String model;
	private String make;
	private int cost;

	public Car(String model, String make, int cost) {
		super();
		this.model = model;
		this.make = make;
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
