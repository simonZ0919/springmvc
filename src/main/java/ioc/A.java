package ioc;


public class A {
	private IB b,c;
	private int userID;
	private String hobby,username,pwd;

	public A(IB c) {
		System.out.println("construct A");
		this.c = c;
	}	
	
	public void setB(IB b) {
		this.b = b;
	}	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public void setHobby(String hb) {
		this.hobby = hb;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String uname) {
		this.pwd = uname;
	}

	public void service() {
		// object b created by conntainer
		b.f1();
		c.f1();
		System.out.println(userID+" "+hobby+" "+pwd+" "+username);		
	}
}
