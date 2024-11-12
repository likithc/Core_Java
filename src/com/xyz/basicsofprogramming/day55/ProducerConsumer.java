package com.xyz.basicsofprogramming.day55;

class producer extends Thread{
	Queue a;
	public producer(Queue q) {
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
class consumer extends Thread{
	Queue b;
	public consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
		b.get();
		}
	}

}
class Queue{
	int x;
	void put(int i) {
		x=i;
		System.out.println("producer has produced the value "+i+" in x");
	}
	void get() {
		System.out.println("producer has consumed the value "+x);

	}
}

public class ProducerConsumer {
	public static void main(String[] args) {
		Queue q = new Queue();
		producer p = new producer(q);
		consumer c = new consumer(q);
		
		p.start();
		c.start();
		
		}
}
