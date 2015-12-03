package com.srikanth.Sorting;

public class QuickSort {
	int [] numbers;
	int size;
	public QuickSort(int[] numbers) {
	this.numbers=numbers;
	this.size=numbers.length;
	}
	public int partition(int[] A,int low,int high){
		int i=low-1;
		int j=low;
		int pivot=A[high];
		for(int iPointer=low;iPointer<high;iPointer++){
			if(A[iPointer]<pivot){
				i++;
				int temp=A[j];
				A[j]=A[iPointer];
				A[iPointer]=temp;
			}
		}
		int temp=A[i+1];
		A[i+1]=A[high];
		A[high]=temp;
		
		Util.printArray(A);
		
		return i+1;
				
		
	}
	

}
