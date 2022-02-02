package com.javaDay5;

public class RemoveCharacterFromString {

	 public static void main(String[] args)
	 {  
         String str = "India is my country";  
         System.out.println(str);
         System.out.println("\nAfter removing character :");
         System.out.println(charRemoveAt(str, 7));  
      }  
      public static String charRemoveAt(String str, int p)
      {  
         return str.substring(0, p) + str.substring(p + 1);  
      }  
}
