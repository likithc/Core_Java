package com.xyz.basicsofprogramming.day67;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket csoc = new Socket("192.168.1.6",4000);
		OutputStream os = csoc.getOutputStream();

		for(int i=0;i<=5;i++) {
			DataOutputStream dos = new DataOutputStream(os);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the message");
			String message = sc.nextLine();

			dos.writeUTF(message);

			ServerSocket listener = new ServerSocket(4000);
			Socket ssoc = listener.accept();
			System.out.println("The server is ready to" + "accept the input");
			InputStream is =  ssoc.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String message1 = dis.readUTF();
			System.out.println(message1);
		}
	}
}
