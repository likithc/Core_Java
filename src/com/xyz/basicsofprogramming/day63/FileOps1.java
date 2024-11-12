package com.xyz.basicsofprogramming.day63;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOps1 {

	public static void main(String[] args) throws IOException {
		String input_path ="/Users/likithc/Documents";
		String output_path ="/Users/likithc/Documents";
		
		FileInputStream fis = new FileInputStream(input_path);
		int temp;
		FileOutputStream fos = new FileOutputStream(output_path);
		
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();
	}

}
