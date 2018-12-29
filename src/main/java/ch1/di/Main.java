/**
 * 
 */
package ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-17 ÏÂÎç7:17:32
 */

public class Main {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		FunctionHello functionHello = context.getBean(FunctionHello.class);
		
		System.out.println(useFunctionService.sayHello("zhihua"));
		System.out.println(functionHello.sayHello("di"));
		
		context.close();
	}
}
