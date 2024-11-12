package com.xyz.basicsofprogramming.day66;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DeserializationCode {

	public static void main(String[] args) {
		String path ="/Users/likithc/Documents/Cricketer.txt";
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream oss = new ObjectInputStream(fis);
		Cricketer c =(Cricketer)oos.readObject(c);
		c.display();
	}
	}


