/**
 * 
 */
package ch1.di;

import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-17 ÏÂÎç4:43:12
 */
@Service
public class FunctionHello {
	
	public String sayHello(String word){
		return "Hello" + word + "!";
	}

}
