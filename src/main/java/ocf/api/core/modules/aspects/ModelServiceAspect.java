package ocf.api.core.modules.aspects;

import java.text.MessageFormat;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ModelServiceAspect {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Pointcut("execution(* ocf.api.core.modules.interfaces.IModelService.process(..))")
	public void modelServicePointcut() {}
	
	@Around(value="modelServicePointcut()")
	public Object defaultModelServicePointcutOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable  
	{
		Long startMillis=System.currentTimeMillis();
		Object object=proceedingJoinPoint.proceed();
		logger.debug(MessageFormat.format("{0} process method finished operation in {1} milliSeconds", proceedingJoinPoint.getTarget().getClass().getSimpleName(),System.currentTimeMillis()-startMillis));
		return object;
		
	}

}
