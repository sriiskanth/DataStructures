package com.srikanth.codefromnet;

import java.util.Random;
import java.util.Stack;

public class BinarySearchTree {

	private Node root;

	public int size(Node x) {
		if (x == null)
			return 0;
		else
			return x.getSize();
	}

	public String get(int key) {
		return get(root, key);
	}

	public void put(int key, String value) {
		root = put(root, key, value);
	}

	private Node put(Node x, int key, String value) {
		if (x == null)
			return new Node(key, value, 1);
		else if (key < x.getKey())
			x.setLeft(put(x.getLeft(), key, value));
		else if (key > x.getKey())
			x.setRight(put(x.getRight(), key, value));
		else {
			x.setValue(value);
			x.setKey(key);
			x.setSize(size(x.getLeft()) + size(x.getRight()) + 1);
		}
		return x;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getValue() + ":" + node.getKey() + ",");

			inOrder(node.getRight());
		}

	}

	private String get(Node x, int key) {

		if (root == null)
			return "";
		else if (key < x.getKey())
			return get(x.getLeft(), key);
		else if (key > x.getKey())
			return get(x.getRight(), key);
		else
			return x.getValue();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++)
				System.out.print("  ");
			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.getKey());
					localStack.push(temp.getLeft());
					localStack.push(temp.getRight());
					if (temp.getLeft() != null || temp.getRight() != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print("  ");
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		} // end while isRowEmpty is false
		System.out.println("......................................................");
	} // end
		// displayTree()

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		
		
		for (int i=0;i<30;i++){
			tree.put(new Random().nextInt(100), SessionIdentifierGenerator.nextSessionId());
		}
//		tree.put(6, "c");
//		tree.put(5, "d");
//		
//		tree.put(3, "f");
//		tree.put(10, "a");
//		tree.put(1, "This is sik");
//		tree.put(4, "e");
//		tree.put(9, "b");
//		tree.put(2, "g");
		System.out.println(":::::Binary Search Tree::::");
		// System.out.println(tree.get(6));
		//tree.inOrder();
		tree.displayTree();

	}
}
