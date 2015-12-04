package com.srikanth.Sorting;

import com.srikanth.util.Util;

public class ShellSort {
	public int numbers[];
	public int size;

	public ShellSort(int[] a) {
		super();
		numbers = a;
		size=numbers.length-1;
	}
	public void sort() {
		int[] gaps={4,3,2,1};
		for(int gap:gaps){
			for(int i=gap;i<=size;i++){
				int temp=numbers[i];
				int j=i;
				while(j>=gap&& numbers[j-gap]>temp){
					numbers[j]=numbers[j-gap];
					j-=gap;
					Util.printArray(numbers,"");	
				}
				numbers[j]=temp;
			}
			
		}
		
		Util.printArray(numbers,"After Shell Sort");
		
	}

}
