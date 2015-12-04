package com.srikanth.Sorting;

import com.srikanth.util.Util;

public class QuickSort {
	public int A[];

	public QuickSort(int[] a) {
		super();
		A = a;
	}
	
	public void sort() {
		int left=0;
		int right=A.length-1;
		quickSort(left,right);
		Util.printArray(A,"After Quicksort");
	}
	public void quickSort(int left,int right) {
		if(left<right){
			int partitionElement=partition(left,right);
			quickSort(left, partitionElement-1);
			quickSort(partitionElement+1, right);
		}
	}
	
	public int partition(int left,int right) {
		int i=left-1;
		int iPointer=left;
		int pivot=A[right];
		for (;iPointer<right;iPointer++){
			if(A[iPointer]<=pivot){
				i++;
				int temp=A[iPointer];
				A[iPointer]=A[i];
				A[i]=temp;
			}
		}
		int temp=A[i+1];
		A[i+1]=A[right];
		A[right]=temp;
		System.out.println("Pivot Point : "+(i+1));
		//Util.printArray(A);
		return i+1;
	}
	

}
