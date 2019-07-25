package com.searching.examples;

public class LinearSearch {

	public static void main(String[] args) {
			
		int[] arr = {4,5,2,9,8,20};
		int search = 8;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			{
				if(arr[i]==search) {
					System.out.println("Element is at " +i +"Index position");
					temp = temp+1;
				}
			}
		}
		if(temp==0) {
			System.out.println("Element is not present in the list");
		}
	}

}
