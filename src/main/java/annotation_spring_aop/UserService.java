package annotation_spring_aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @author Hou Zhihua
 * @date 2019-1-3 ÉÏÎç10:03:59
 */
@Component
public class UserService {
	
	private final static Log log = LogFactory.getLog(UserService.class);
	
	public User get(long id){
		if(log.isInfoEnabled()){
			log.info("getUser method ...");
		}
		return new User();
	}
	
	public void save(User user){
		if(log.isInfoEnabled()){
			log.info("saveUser method ...");
		}
	}
	
	public boolean delete(long id) throws Exception{
		if(log.isInfoEnabled()){
			log.info("deleteUser method ...");
			throw new Exception("spring aop ThrowAdvice ÑÝÊ¾");
		}
		return false;
	}
}
