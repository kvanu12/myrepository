package com.searching.examples;

public class BinaryDemo {

	public static void main(String[] args) {
		
		int[] a = {2,4,6,8,10,11,15,18};
		int search = 15;
		int li =0;
		int hi = a.length - 1;
		int mi = (li+hi)/2;
		while(li<=hi) {
		if (a[mi]==search) {
			
			System.out.println("Element search is at" + mi +"index position");
			break;
		}else if(a[mi]<search) {
			
			li = mi+1;
		}
		else {
			hi = mi-1;
		}
		mi = (li+hi)/2;
	}

	}
}
