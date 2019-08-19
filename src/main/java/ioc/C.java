package ioc;

import java.util.Map;

public class C implements IB{
	private int number;
	private Map<String, String>users;
	public C() {
		System.out.println("construct c");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}

	public void f1() {
		System.out.println(users);
	}
}
