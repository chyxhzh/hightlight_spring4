/**
 * 
 */
package me.spring.beans.colltions;

import java.util.Map;

import me.spring.beans.Car;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-18 ����3:56:44
 */

public class NewPerson {
	private String name;
	private int age;
	private Map<String, Car> cars;
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
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	
	public NewPerson() {}
	
	public NewPerson(String name, int age, Map<String, Car> cars){
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
}
