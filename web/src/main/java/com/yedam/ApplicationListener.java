package com.yedam;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
public class ApplicationListener
		implements ServletContextListener, ServletRequestListener, ServletRequestAttributeListener {

	/**
	 * Default constructor.
	 */
	public ApplicationListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
	 */
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	// 어플리케이션(톰캣서버) 시작될 때 이벤트핸들러
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("어플리케이션 시작");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	// 어플리케이션(톰캣서버) 종료될 때 이벤트핸들러
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("어플리케이션 종료");
	}

	/**
	 * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
	 */
	// request 객체가 생성될 때 이벤트핸들러
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request 생성");
	}

	/**
	 * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
	 */
	// request 객체가 종료될 때 이벤트핸들러
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request 종료");
	}

	/**
	 * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
	 */
	// request 객체가 변경될 때 이벤트핸들러
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("request 수정");
	}

	/**
	 * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
	 */
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("request 속성 추가");
	}

}
