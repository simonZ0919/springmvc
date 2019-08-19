package ioc;

import java.util.List;

public class B implements IB{
	private IB c1;
	private List<String> interest;
	public  B() {
		System.out.println("construct B");
	}
	
	public void setC1(IB c) {
		this.c1 = c;
	}

	public List<String> getInterest() {
		return interest;
	}

	public void setInterest(List<String> interest) {
		this.interest = interest;
	}

	public void f1() {
		System.out.println(c1+" "+interest);
	}
	
}
