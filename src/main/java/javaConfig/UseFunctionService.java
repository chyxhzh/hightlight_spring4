package javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-28 ����9:06:32
 */
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;

	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
