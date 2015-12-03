package com.srikanth.Sorting;

public class BubbleSort {
	public int[] numbers;
	public int size;
	public BubbleSort(int[] numbers) {
		this.numbers=numbers;
		size=numbers.length;
		
	}
	public void sort() {
		
		for(int i=size;i>0;i--){
			for(int j=0;j<size-1;j++){
				if(numbers[j]>numbers[j+1]){
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
				//Util.printArray(numbers);
			}
		}
		System.out.println("After sorting:");
		Util.printArray(numbers);
	}

}
