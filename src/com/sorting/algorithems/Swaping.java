package com.sorting.algorithems;

public class Swaping {

	public static void main(String[] args) {
		int s=12;
		int g=78;
		System.out.println("before swap: s:"+s+" g:"+g);
//		s=s+g;//without temp we are swaping
//		g=s-g;
//		s=s-g;
//		System.out.println("after swap: s:"+s+" g:"+g);
		
		int temp=s;
		s=g;
		g=temp;
		System.out.println("after swap: s:"+s+" g:"+g);
		

	}

}
