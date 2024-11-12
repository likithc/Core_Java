package com.xyz.basicsofprogramming.day63;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps2 {
	public static void main(String[] args) throws IOException {
		String input_path ="/Users/likithc/Desktop/Files/input.txt";
		String output_path ="/Users/likithc/Desktop/Files/output.txt";
		
		FileReader fr = new FileReader(input_path);
		int temp;
		FileWriter fw = new FileWriter(output_path);
		
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fr.close();
		fw.close();
	}
}
