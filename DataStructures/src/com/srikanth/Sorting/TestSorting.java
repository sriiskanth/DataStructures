package com.srikanth.Sorting;

import java.util.Scanner;

import com.srikanth.util.Util;

public class TestSorting {
	public static void main(String[] args) {
		System.out.print("Enter Size of array:");
		Scanner sc = new Scanner(System.in);
		int array[] = Util.getArray(sc.nextInt());
		Util.printArray(array,"Before Sorting");
while(true){
	System.out.println("Enter options :\n");
	System.out.println("1.Merge sort ");
	System.out.println("2.Quick sort ");
	System.out.println("3.Selection sort ");
	System.out.println("4.Insertion sort ");
	System.out.println("5.Bubble sort ");
	System.out.println("6.Shell sort ");
	System.out.println("7.Heap sort ");
	System.out.println("8.Exit ");

	System.out.print("Your option:");
	//Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	switch (i) {
	case 1:
		MergeSort mergeSort = new MergeSort(array);
	    mergeSort.sort();
		break;
	case 2:
		QuickSort quickSort=new QuickSort(array); quickSort.sort();
		break;
	case 3:
		SelectionSort selectionSort=new SelectionSort(array);selectionSort.sort();
		break;
	case 4:
		InsertionSort insertionSort=new InsertionSort(array);insertionSort.sort();
		break;
	case 5:
		BubbleSort bubbleSort=new BubbleSort(array);bubbleSort.sort();
		break;
	case 6:
		ShellSort shellSort=new ShellSort(array);shellSort.sort();
		break;
	case 7:
		HeapSort heapSort=new HeapSort(array);heapSort.sort();
		break;
	case 8:
		System.exit(1);
		break;
	default:
		break;
	}
	
}

	}

}
