package com.srikanth.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

public class Duplicate {

	public static void main(String[] args) {
		int[] array=Util.getArray(10);
		int k=4;
		Boolean isDuplicate=isDuplicate(array,k);
		int[] majorityArray={2,1,3,4,3,4,4,6,4,4,4,4};
		int majority=findMajority(majorityArray);
		System.out.println(majority);

	}

	private static int findMajority(int[] majorityArray) {
		Arrays.sort(majorityArray);
		int majorityCount=1;
		for (int i = 0; i < majorityArray.length-1; i++) {
			if(majorityArray[i]==majorityArray[i+1]){
				majorityCount++;
			}else{
				majorityCount=1;
			}
			if(majorityCount>majorityArray.length/2)
				return majorityArray[i];
		}
		return 0;
	}

	private static Boolean isDuplicate(int[] array, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])){
				int j=map.get(array[i]);
				if(i-j<=k){
					return true;
				}
			}
			map.put(array[i],i);
		}
		return false;
	}

}
