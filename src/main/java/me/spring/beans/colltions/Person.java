/**
 * 
 */
package me.spring.beans.colltions;

import java.util.List;

import me.spring.beans.Car;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-18 ����3:50:50
 */

public class Person {
	private String name;
	private int age;
	private List<Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public Person(){}
	
	public Person(String name, int age, List<Car> cars){
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
}
