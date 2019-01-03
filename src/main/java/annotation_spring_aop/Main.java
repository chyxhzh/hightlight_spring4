package annotation_spring_aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @author Hou Zhihua
 * @date 2019-1-3 ÉÏÎç10:33:11
 */

public class Main {
	public static void main(String[] args){
		
		final Log log = LogFactory.getLog(Main.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop_annotation.xml");
		
		UserService userService = (UserService) context.getBean("userService");
		
		log.info("--------------");
		userService.get(1);
		log.info("--------------");
		userService.save(new User());
		log.info("--------------");
		try {
			userService.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
