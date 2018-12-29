package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-28 ����9:11:45
 */
@Configuration
@ComponentScan("javaConfig")
public class JavaConfig {
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
}
