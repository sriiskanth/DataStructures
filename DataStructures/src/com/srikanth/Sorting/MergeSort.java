package com.srikanth.Sorting;

public class MergeSort {
	
	public void sort(){
		
	}
	public void mergesort(int[] a,int lowerIndex,int higherIndex){
		if(lowerIndex==higherIndex){
			return;
		}else{
			int mid=(lowerIndex+higherIndex)/2;
			mergesort(a,lowerIndex,mid);
			//mergesort
			
			
		}
	}
	
	public void merge(int[] numbers,int[] a,int[] b){
	int pointerToNumbers	=	0;
	int pointerToA			=	0;
	int pointerToB			=	0;
	
		while(pointerToA<a.length&&pointerToB<b.length){
			
        if(a[pointerToA]<b[pointerToB]){
        	numbers[pointerToNumbers++]=a[pointerToA++];
        }else{
        	numbers[pointerToNumbers++]=b[pointerToB++];
        }
        
        
        
        Util.printArray(numbers);
        }
		while(pointerToA<a.length){
        	numbers[pointerToNumbers++]=a[pointerToA++];
        }
		while(pointerToB<b.length){
        	numbers[pointerToNumbers++]=b[pointerToB++];
        }
		
		
		Util.printArray(numbers);
	}

	

}
