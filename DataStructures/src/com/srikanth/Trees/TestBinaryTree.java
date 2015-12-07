package com.srikanth.Trees;

import com.srikanth.util.Util;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree btree=new BinarySearchTree();
		int[] arr=Util.getArray(10);
		
		//int[] arr={6,1,8,23,4,87,12,7,21,45,78,100,13};
		for (int i = 0; i < arr.length; i++) {
			btree.add(arr[i]);
		}
		btree.inOrder();
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		btree.printTree();
		System.out.println("Min	:	"+btree.findMin());
		System.out.println("Max	:	"+btree.findMax());
		//Node parent=btree.parentNode(100);
		//System.out.println("Parent	:	"+parent.getValue());
	}

}
