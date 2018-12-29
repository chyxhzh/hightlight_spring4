package javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-28 ÏÂÎç9:14:03
 */

public class Main {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		UseFunctionService useFunctionService = acac.getBean(UseFunctionService.class);
		
		System.out.println(useFunctionService.sayHello("java config"));
		
		acac.close();
	}
}
