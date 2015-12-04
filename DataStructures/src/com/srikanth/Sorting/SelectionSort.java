package com.srikanth.Sorting;

import javax.print.attribute.standard.NumberUpSupported;

import com.srikanth.util.Util;

public class SelectionSort {
	
	public int numbers[];
	public int size;

	public SelectionSort(int[] a) {
		super();
		numbers = a;
		size=numbers.length-1;
	}
	
	
	public void sort() {
		int i,j;
		int iMin;
		
		for(i=0;i<size;i++){
			iMin=i;
			for(j=i+1;j<size+1;j++){
				if(numbers[j]<numbers[iMin]){
					iMin=j;
				}
				
			}
			if(iMin!=i){
				int temp =numbers[i];
				numbers[i]=numbers[iMin];
				numbers[iMin]=temp;
			}
		}
		Util.printArray(numbers,"After selection sort:");
		
	}

}
