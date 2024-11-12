package com.xyz.basicsofprogramming.day55;



class producer1 extends Thread{
	Queue a;
	public producer1(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
		}
	}
}
class consumer1 extends Thread{
	Queue b;
	public consumer1(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
		b.get();
		}
	}

}
class Queue1{
	int x;
	boolean value_of_x=false;
	 
	synchronized void put(int i) {
		try {
		if(value_of_x==false) {
		x=i;
		System.out.println("producer has produced the value "+i+" in x");
		value_of_x=true;
		notify();
	}
		else {
			wait();
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized void get() {
		try {
			if(value_of_x==true) {
				System.out.println("producer has consumed the value "+x);
				value_of_x=false;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ProducerConsumer2 {
	public static void main(String[] args) {
		Queue q = new Queue();
		producer p = new producer(q);
		consumer c = new consumer(q);
		
		p.start();
		c.start();
		
		}
}
