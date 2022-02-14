package com.javaDay11;

import java.io.*;

public class MyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello world";
		try
		{
		FileWriter fw=new FileWriter("abc.txt");
		fw.write(65);
		
		fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
