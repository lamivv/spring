package com.company.common.advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Aspect // 어드바이스를 모아놓은 클래스 (aspect)
@Component // 빈등록
public class LogAdvice {

	@Pointcut("execution(* com.company..*Impl.*(..))")
	public void allpointcut() { // 메서드명 == 포인트컷명
	}

	// Advice 메서드
	@Before("allpointcut()")
	public void logprint(JoinPoint jp) {
		String methodName = jp.getSignature().getName(); // 호출된 서비스의 메소드이름
		log.info("[before] 서비스 호출: "+ methodName);
		
		Object[] args = jp.getArgs(); // 호출된 서비스의 매개변수 (배열)
		if ( args != null && args.length > 0 ) {
			log.info("파라미터: " + args[0].toString());
		}
	}

	// Advice 메서드
	@AfterReturning("allpointcut()")
	public void afterprint() {
		log.info("[after] 서비스 호출");
	}
	
	@Around("execution(* com.company..*Impl.*(..))")
	public Object logTime( ProceedingJoinPoint pjp) {
		long start = System.currentTimeMillis();
		
		log.info("target: " + pjp.getTarget());
		log.info("Param: " + Arrays.toString(pjp.getArgs()));
		
		// invoke method
		Object result = null;
		
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		log.info("TIME: " + (end - start));
		
		return result;
	}
}
