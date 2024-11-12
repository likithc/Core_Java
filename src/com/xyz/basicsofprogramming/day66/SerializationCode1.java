package com.xyz.basicsofprogramming.day66;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class SerializationCode1 {
	public static void main(String[] args) {
		String path ="/Users/likithc/Documents/Cricketer.txt";
		Cricketer c = new Cricketer("Sachin",1,300,2000,200);
		
		c.display();
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oss = new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
}
