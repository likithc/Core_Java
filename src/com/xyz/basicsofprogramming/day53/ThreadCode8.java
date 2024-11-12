package com.xyz.basicsofprogramming.day53;

import com.xyz.basicsofprogramming.day37.override;

class MicrosoftOps extends Thread{
	@override
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("SpellCheck")) {
			spellCheck();
		}
		else {
			saving();
		}
		
	}
	//Primary operation-Condition-1
	public void saving() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Typing");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//second operation-Condition-1

	public void spellCheck() {
		try {
			for(;;) {
				System.out.println("Spell-Checking");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//third operation-Condition-1

	public void typing() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Saving");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


public class ThreadCode8 {
	public static void main(String[] args) {
		MicrosoftOps mos1 = new MicrosoftOps();
		mos1.setName("Typing");
		MicrosoftOps mos2 = new MicrosoftOps();
		mos2.setName("Typing");
		MicrosoftOps mos3 = new MicrosoftOps();
		mos3.setName("Typing");
		
		mos2.setDaemon(true);
		mos3.setDaemon(true);
		
		mos2.setPriority(8);
		mos3.setPriority(9);
		
		mos1.start();
		mos2.start();
		mos3.start();


	}
}
