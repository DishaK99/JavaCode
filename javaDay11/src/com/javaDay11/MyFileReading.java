package com.javaDay11;

import java.io.File;
import java.util.*;

public class MyFileReading {

	public static void main(String args[])
	{
		File file=new File("abc.txt");
		Scanner sc=new Scanner(System.in);
		try
		{
		//while(sc.hasNext())
		//{
			//String data=sc.nextLine();
			//System.out.println(data);
			System.out.println("File name :"+file.getName());
			System.out.println("File Path :"+file.getPath());
			System.out.println("File Space :"+file.getTotalSpace());
			System.out.println("File AbsolutePath :"+file.getAbsolutePath());
			System.out.println("File name :"+file.getUsableSpace());
			System.out.println("File freeSpace :"+file.getFreeSpace());
			System.out.println("File length :"+file.length());
		//}
		sc.close();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
