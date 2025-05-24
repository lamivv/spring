package com.yedam.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// 상속과 다형성
    	// 같은 코드지만 참조하는 대상에 따라서 실행결과 다름
    	// TV tv = new LgTV();
    	
    	// 아래는 xml형식
//    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	
    	// 아래는 java형식
    	ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfigure.class);
    	TV tv = (TV)context.getBean("tv");
    	tv.powerOn();
    	tv.volumeUp();
    }
}
