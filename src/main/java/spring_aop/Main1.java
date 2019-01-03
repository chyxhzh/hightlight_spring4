package spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2019-1-2 ÏÂÎç2:54:58
 */

public class Main1 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		HelloWorld hw1 = (HelloWorld) context.getBean("helloWorld1");
		HelloWorld hw2 = (HelloWorld) context.getBean("helloWorld2");
		
		hw1.printHelloWorld();
		System.out.println("--------------");
		hw1.doPrint();
		
		System.out.println("--------------");
		hw2.printHelloWorld();
		System.out.println("--------------");
		hw2.doPrint();
	}
}
