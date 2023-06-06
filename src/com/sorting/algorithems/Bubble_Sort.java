package com.sorting.algorithems;

public class Bubble_Sort {

	public static void main(String[] args) {
		//int[] arr = { 47, 7,2, 17 ,5,  33, 12, 14 };
				int arr[] = {-2,45,0,11,-9};
			for(int j=1; j<=arr.length-1;j++) {	
				for(int i=0;i<arr.length-j;i++) {
					if(arr[i]>arr[i+1]) {
						int temp = arr[i+1];
						arr[i+1] =arr[i];
						arr[i] = temp;
					}
				}
			}	
						
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}

	}

}
