package annotation_spring_aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @author Hou Zhihua
 * @date 2019-1-3 ����8:54:01
 */
@Component  //����һ�����
@Aspect    //��������һ������Bean
public class ServiceAspect {
	
	private final static Log log = LogFactory.getLog(ServiceAspect.class);
	
	//��������㣬�÷����޷����壬��ҪΪ����ͬ������������ʹ�ô˴����õ������
	@Pointcut("execution(* annotation_spring_aop..*(..))")
	public void aspect(){}
	
	@Before("aspect()")
	public void before(JoinPoint joinPoint){
		System.out.println("ִ��before...");
	}
	
	@After("aspect()")
	public void after(JoinPoint joinPoint){
		System.out.println("ִ��after...");
	}
	
	@Around("aspect()")
	public void around(JoinPoint joinPoint){
		long start = System.currentTimeMillis();
		
		try{
			((ProceedingJoinPoint)joinPoint).proceed();
			long end = System.currentTimeMillis();
			if(log.isInfoEnabled()){
				log.info("around" + joinPoint + "\t Use time : " + (end - start) + "ms!");
			}
		}catch(Throwable e){
			long end = System.currentTimeMillis();
			if(log.isInfoEnabled()){
				log.info("around" + joinPoint + "\t Use time : " + (end - start) + "ms with exception :" + e.getMessage());
			}
		}
	}
	
	@AfterReturning("aspect()")
	public void afterReturn(JoinPoint joinPoint){
		if(log.isInfoEnabled()){
			log.info("afterReturn" + joinPoint);
		}
	}
	
	@AfterThrowing(pointcut="aspect()", throwing="ex")
	public void afterThrow(JoinPoint joinPoint, Exception ex){
		if(log.isInfoEnabled()){
			log.info("afterThrow" + joinPoint + "\t" + ex.getMessage());
		}
	}
}
