package com.srikanth.Sorting;

public class Util {

	public static void printArray(int[] numbers) {
		System.out.print("[");
		for (int n : numbers) {
			System.out.print(" " + n + " ");
		}
		System.out.print("]\n");
	}
	
	public static int[] getArray(){
		int size=(int) (Math.random()*20);
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		return array;
	}

}
