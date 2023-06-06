package com.sorting.algorithems;

public class shifting {

	public static void main(String[] args) {
	
			int[] arr = { 4, 2, 7, 5, 17, 33, 12, 14 };
			/*
			 * int temp = arr[7]; arr[7] =arr[6]; arr[6] =arr[5]; arr[5] = arr[4]; arr[4]
			 * =arr[3]; arr[3] = arr[2]; arr[2] =arr[1]; arr[1] =arr[0];
			 * 
			 * arr[0] =temp;
			 */
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
		
		}

	}

}
