/**
 * 
 */
package me.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @author 侯治华
 * @date 2018-12-18 上午9:22:02
 */

public class Main {
	
	public static void main(String[] args){
		//1.创建Spring的IOC容器
		//ApplicationContext代表IOC容器
		//ClassPathApplicationContext是ApplicationContext的实现类，该实现从类路径下加载配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取bean实例
		//利用id定位到IOC容器中的bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//2.1 利用类型返回IOC容器中的bean，但要求IOC容器中只能有一个该类型的bean
//		HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
		
		//3.调用hello方法
		helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		Person person2 = (Person) ctx.getBean("person2");
		System.out.println(person2);
		
	}
}
