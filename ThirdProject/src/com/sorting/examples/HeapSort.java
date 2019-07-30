package com.sorting.examples;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {23,4,12,52,17,72,56,1};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		hs.printArray( arr);

	}


 void printArray(int[] arr) {
	 for(int i = 0;i<arr.length;i++) {
		 System.out.println(arr[i] +" ");
	 }
		
	}


	void sort(int[] arr) {
	int length = arr.length;
	for(int i =length/2-1;i>=0;i--) {
		heapify(arr,length,i);
	}
	for(int i=length-1;i>=0;i--) {
		int temp = arr[0];
		arr[0]= arr[i];
		arr[i]=temp;
		heapify(arr, i, 0);
	}
		
	}

	 void heapify(int[] arr, int n, int i) {
		
		int largest = i;  //parent node index position
		int li = 2*i+1;		// left child index position
		int ri = 2*i+2;		//right child index position
		
		if(li<n && arr[li] >arr[largest]) {
			largest = li;
			
		}
		if(ri<n && arr[ri]>arr[largest]) {
			largest = ri;
		}
		if(largest!=i) {
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heapify(arr,n,largest);
		}
		 
		
	}

}
