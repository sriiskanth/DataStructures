package com.srikanth.Sorting;

public class MergeSort {
	
	public int[] a;
	public int size;
	MergeSort(int[] a){
		this.a=a;
		size=a.length;
	}
	public void sort(){
		int[] tempArray=new int[a.length];
		mergesort(tempArray,0,a.length-1);
	}
	private void mergesort(int[] tempArray, int lowerIndex, int higherIndex) {

		if(lowerIndex==higherIndex){
			return;
		}
		else{
			int mid=(lowerIndex+higherIndex)/2;
			mergesort(tempArray, lowerIndex, mid);
			mergesort(tempArray, mid+1,higherIndex);
			merge(tempArray,0,mid+1,higherIndex);
			printArray(tempArray);
		}
		
	}
	private void printArray(int[] tempArray) {
		System.out.print("[");
		for(int i : tempArray){
			System.out.print(i+" ");
		}
		
		System.out.println("]");
		
	}
	private void merge(int[] tempArray, int lowerIndexCursor, int midIndex, int higherIndex) {
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int middlePointer=midIndex-1;
		int totalItems = higherIndex-lowerIndex+1;
		
		while(lowerIndex<=middlePointer&& midIndex<=higherIndex){
			if(a[lowerIndex]<a[midIndex]){
				tempArray[tempIndex++]=a[lowerIndex++];
			}
			else{
				tempArray[tempIndex++]=a[midIndex++];
			}
		}
		
		while(lowerIndex<=middlePointer){
			tempArray[tempIndex++]=a[lowerIndex++];
		}
		while(midIndex<=higherIndex){
			tempArray[tempIndex++]=a[midIndex++];
		}
		for(int i=0;i<totalItems;i++){
			a[lowerIndexCursor+i]=tempArray[i];
		}
		
	}
	
	
	public void printArray() {
	System.out.print("[");
		for(int i : a){
			System.out.print(i+" ");
		}
		
		System.out.println("]");
	}
	
	
}



