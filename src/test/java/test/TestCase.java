package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import annotation.UserService;
import ioc.A;

public class TestCase {
	@Test
	// test set injection 
	public void test1() {
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("basic.xml");
		A a=context.getBean("a1",A.class);	
		a.service();
		// get class by annotation
		System.out.println("get bean");
		UserService s1=(UserService)context.getBean("service");
		s1.login();
		context.close();
	}
	ViewResolver vResolver;
	InternalResourceViewResolver vsInternalResourceViewResolver;
}
