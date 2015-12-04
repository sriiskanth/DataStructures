package com.srikanth.util;

public class Util {
	public static void printArray(int array[], String string) {
		
		System.out.println(string);
		System.out.print("[");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}

	/**
	 * 
	 * @param size Size of the Array
	 * @return
	 */
	public static int[] getArray(int size) {
		int[] array = new int[size];
		int item = 0;
		for (int i = 0; i < size; i++) {
			item = (int) (Math.random() * 100);
			array[i] = item;
		}
		return array;
	}
	
	public static String getString(int size){
		RandomString randomString=new RandomString(size);
		return randomString.nextString();
	}

}
