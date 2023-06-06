package com.basicprograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=s.next();//for line we need to take s.nextLine();
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
			
		}
		if(str1.equals(str)) {//str1.equalsIgnoreCase(str)
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
		

	}

}
