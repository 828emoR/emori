package com.yedam.myserver.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component//어노테이션으로 bean 등록
@Aspect

public class LogAdvice {
	@Pointcut("execution(* com.yedam..*Impl.*(..))")
	public void allpointcut() {}
	
	@Before("allpointcut()")
	public void printLog(JoinPoint jp) {
		String name = jp.getSignature().getName();
		String arg = jp.getArgs() != null && jp.getArgs().length>0 ? jp.getArgs()[0].toString() : "";
		System.out.println("[before]로그 출력" + name+ ":" + arg);
		
	}

}
