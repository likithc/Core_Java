package com.xyz.basicsofprogramming.day53;


class warrior extends Thread{
	String res1="AK-47";
	String res2="smg";
	String res3="sniper";
	
	public void run() {
		if(Thread.currentThread().getName().equals("halesh")) {
			HaleshCaputred();
		}
		else {
			VishnuCaputred();
		}
	}

	private void HaleshCaputred() {
		try {
			synchronized(res1) {
				System.out.println(Thread.currentThread().getName()+"has acquired"+res1);
			}
			synchronized(res1) {
				System.out.println(Thread.currentThread().getName()+"has acquired"+res2);
			}
			synchronized(res1) {
				System.out.println(Thread.currentThread().getName()+"has acquired"+res3);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void VishnuCaputred() {
		try {
			synchronized(res1) {
				System.out.println(Thread.currentThread().getName()+"has acquired"+res3);
			}
			synchronized(res1) {
				System.out.println(Thread.currentThread().getName()+"has acquired"+res2);
			}
			synchronized(res1) {
				System.out.println(Thread.currentThread().getName()+"has acquired"+res1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
}
public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
warrior w1=new warrior();
w1.setName("halesh");
warrior w2=new warrior();
w2.setName("vishnu");
w1.start();
w2.start();
	}

}