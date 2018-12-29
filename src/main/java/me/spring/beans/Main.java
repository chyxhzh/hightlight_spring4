/**
 * 
 */
package me.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-18 ����9:22:02
 */

public class Main {
	
	public static void main(String[] args){
		//1.����Spring��IOC����
		//ApplicationContext����IOC����
		//ClassPathApplicationContext��ApplicationContext��ʵ���࣬��ʵ�ִ���·���¼��������ļ�
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ȡbeanʵ��
		//����id��λ��IOC�����е�bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//2.1 �������ͷ���IOC�����е�bean����Ҫ��IOC������ֻ����һ�������͵�bean
//		HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
		
		//3.����hello����
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
