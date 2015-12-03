package com.srikanth.Sorting;

public class TestSorting {
	public static void main(String[] args) {
		
		//MergeSort mergeSort=new MergeSort();
		int[] a=Util.getArray();
		System.out.println("Before QuickSort:");
		Util.printArray(a);
		BubbleSort bubbleSort=new BubbleSort(a);
		bubbleSort.sort();
	}
	
	

}
