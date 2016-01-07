package com.srikanth.Trees;

import com.srikanth.util.Util;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree btree=new BinarySearchTree();
		//int[] arr=Util.getArray(10);
		
		//int[] arr={6,1,8,23,4,87,12,7,21,45,78,100,13};
		int[] arr={7,21,5,3,6,78,13};
		
		for (int i = 0; i < arr.length; i++) {
			btree.add(arr[i]);
		}
		//btree.inOrder();
		btree.printTree();
		btree.levelOrderTraversal();
	}

}
