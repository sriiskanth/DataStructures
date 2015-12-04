package com.srikanth.Sorting;

import com.srikanth.util.Util;

public class BubbleSort {
	public int numbers[];
	public int size;

	public BubbleSort(int[] a) {
		super();
		numbers = a;
		size=numbers.length-1;
	}
	public void sort() {
		for(int i=0;i<=size;i++){
			for(int j=i+1;j<=size;j++){
				if(numbers[i]>numbers[j]){
					swap(i,j);
				}
			}
		}
		Util.printArray(numbers,"After Bubble sort");
	}
	private void swap(int i, int j) {
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}

}
