/**
 * 
 */
package ch1.di;

import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-17 ����4:43:12
 */
@Service
public class FunctionHello {
	
	public String sayHello(String word){
		return "Hello" + word + "!";
	}

}
