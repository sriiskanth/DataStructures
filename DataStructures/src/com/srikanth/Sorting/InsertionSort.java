package com.srikanth.Sorting;

import com.srikanth.util.Util;

public class InsertionSort {
	public int numbers[];
	public int size;

	public InsertionSort(int[] a) {
		super();
		numbers = a;
		size=numbers.length-1;
	}
	public void sort() {
		int k;
		for(int i=1;i<=size;i++){
			k=numbers[i];
			int j=i-1;
			while(j>=0&& numbers[j]>k){
				numbers[j+1]=numbers[j];
				j--;
				
			}
			numbers[j+1]=k;
			Util.printArray(numbers, "At Phase	:	"+i);
		}
		
		
		Util.printArray(numbers,"After Insertion Sort");
		
		
	}

}
