/**
 * 
 */
package ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-17 ÏÂÎç7:29:27
 */

@Service
public class UseFunctionService {
	
	@Autowired
	FunctionHello functionHello;
	
	public String sayHello(String word){
		
		return functionHello.sayHello(word);
		
	}
}
