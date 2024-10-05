package com.xyz.basicsofprogramming.day37;

class Parent{
	 private static int accno;
	 private static int password;
	
	void setcredentials(int accno,int password) {
		this.accno=accno;
		this.password=password;
	}
	void display() {
		System.out.println("Parent accno :" +accno);
		System.out.println("Parent password :" +password);
	}
}

class child1 extends Parent{
	void alterParentData(int accno,int password) {
		this.accno=accno;
		this.password=password;
	}
	
}

public class InheritanceCode1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		child1 c = new child1();
		p.setcredentials(1111, 2222);
		c.setcredentials(2222,3333);
		p.display();
	}

}
