package basic;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
	// applicatinContext:interface, method for container
	// new class: find configure file and start container		
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("basic.xml");
		// create object by id and class 
		SimpleBean bean=context.getBean("sc1", SimpleBean.class);
		bean.sendMsg();
		
		Calendar calendar=context.getBean("cal", Calendar.class);
		Date date=context.getBean("date", Date.class);
		
		System.out.println(calendar.getTime());
		System.out.println(date);
		// close container, call destryo-method
		context.close();
			
	}

}
