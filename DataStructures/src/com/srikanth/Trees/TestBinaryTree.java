package com.srikanth.Trees;

import com.srikanth.util.Util;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree btree=new BinarySearchTree();
		int[] arr=Util.getArray(10);
		for (int i = 0; i < arr.length; i++) {
			btree.add(arr[i]);
		}
		btree.inOrder();
	}

}
