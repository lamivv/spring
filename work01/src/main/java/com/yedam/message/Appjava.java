package com.yedam.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Appjava 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		
		MyController app = ctx.getBean("myApplication", MyController.class);

		app.processMessage("Hi~ douzone 2기!!", "happy@kosa.or.kr");
		
    }
}
//MyController app = (MyController)ctx.getBean("myApplication");