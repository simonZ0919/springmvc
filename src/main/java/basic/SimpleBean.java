package basic;

public class SimpleBean {

	public SimpleBean() {
		System.out.println("TestBean()");
	}
	// init-method
	public void init() {
		System.out.println("init object");
	}
	
	public void sendMsg() {
		System.out.println("send message");
	}
	// destroy-method
	public void destroy() {
		System.out.println("destroy object");
	}
	
}
