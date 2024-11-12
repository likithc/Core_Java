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

	public void spellCheck() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Spell-Checking");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

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

public class ThreadCode7 {
	public static void main(String[] args) {
		MicrosoftOps mos1 = new MicrosoftOps();
		mos1.setName("Typing");
		MicrosoftOps mos2 = new MicrosoftOps();
		mos2.setName("Typing");
		MicrosoftOps mos3 = new MicrosoftOps();
		mos3.setName("Typing");

	}
}
