/**
 * 
 */
package me.spring.beans;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-18 ÉÏÎç9:21:55
 */

public class HelloWorld {
	
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void hello(){
		System.out.println("hello" + name);
	}
}
