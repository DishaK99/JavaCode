package com.javaDay5;

public class RemoveCharacterFromString {

	public static void main(String[] args) 
    {
		StringBuilder MyString = new StringBuilder("Java Code");
        System.out.println("before removing character: " + MyString);
        MyString = MyString.deleteCharAt(5);
        System.out.println("after removing character: " + MyString);
    } 
      

}
