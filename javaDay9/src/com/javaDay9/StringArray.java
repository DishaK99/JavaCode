package com.javaDay9;

interface StringArray1{
	public void print();
}

public class StringArray {
	public static void main(String[] args) {
		StringArray1 string =() ->{
			String[] str = {"Sakshi", "Disha", "Smita", "Suvidhee"};
			for(int i=0; i<str.length;i++) {
				System.out.println(str[i]);
			}
		};
		string.print();
	}

}
