package com.xyz.basicsofprogramming.day63;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOps3 {
	public static void main(String[] args) throws IOException {
		String input_path ="/Users/likithc/Desktop/Files/input.txt";
		String output_path ="/Users/likithc/Desktop/Files/output.txt";
		
		FileReader fr = new FileReader(input_path);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw = new FileWriter(output_path);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}
}
