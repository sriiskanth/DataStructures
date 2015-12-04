package com.srikanth.Sorting;

import java.util.concurrent.Exchanger;

import com.srikanth.util.Util;

public class HeapSort {
	public int numbers[];
	public int size;

	public HeapSort(int[] a) {
		super();
		numbers = a;
		size=numbers.length-1;
	}
	
	public void sort(){
		createHeap();
		
		for(int i=size;i>0;i--){
			exchange(0,i);
			size=size-1;
			maxHeap(0);
		Util.printArray(numbers, "At index	:	"+i);
		}
		Util.printArray(numbers, "After Sorting");
		
	}
	
	public void createHeap() {
		for(int i=size/2;i>=0;i--){
			maxHeap(i);
		}
		Util.printArray(numbers,"After Building Max Heap");
	
		
	}
	
	public void maxHeap(int parent){
		int leftChild=2*parent;
		int rightChild=(2*parent)+1;
		int largest;
		if(leftChild<=size && numbers[leftChild]>numbers[parent]){
			largest=leftChild;
		}else
			largest=parent;
		
		if(rightChild<=size&&numbers[rightChild]>numbers[largest]){
			largest=rightChild;
		}
		
		
		if(largest!=parent){
			exchange(largest,parent);
			maxHeap(largest);	
		}
		
	}

	private void exchange(int largest, int parent) {
		int temp;
		temp=numbers[largest];
		numbers[largest]=numbers[parent];
		numbers[parent]=temp;
	}
			

}
