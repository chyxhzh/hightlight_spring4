/**
 * 
 */
package me.spring.beans;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-18 ÉÏÎç9:21:14
 */

public class Car {
	
	private String brand;
	private String corp;
	private double price;
	private int maxSpeed;
	
	public Car(String brand, String corp, double price){
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	public Car(String brand, String corp, int maxSpeed){
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
