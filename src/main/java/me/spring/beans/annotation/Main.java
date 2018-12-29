package me.spring.beans.annotation;

import me.spring.beans.annotation.service.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-19 ÏÂÎç3:29:34
 */

public class Main {
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
		
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(DiConfig1.class);
//		UserService userService = acac.getBean(UserService.class);
//		userService.add();
	}
}
