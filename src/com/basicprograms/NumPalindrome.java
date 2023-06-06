package com.basicprograms;

import java.util.Scanner;

public class NumPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int number=s.nextInt();
		
		int y,temp=0,x;
		x=number;
		while(x>0) {
			y=x%10;
			temp=(temp*10)+y;
			x=x/10;
			
		}
		if(temp==number) {
			System.out.println( number +" is a palindrome");
		}else {

			System.out.println( number +" ia not a palindrome");
		}
		
		

	}

}
