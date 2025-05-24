package com.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("contextAnnotation.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		
		//BoardController controller = (BoardController)ctx.getBean("board");
		BoardController controller = ctx.getBean(BoardController.class);
		controller.insert();
	}
}
