package com.srikanth.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node find(int key) {
		return find(this.root, key);
	}

	private Node find(Node node, int key) {
		if (node == null)
			return null;
		else {
			if (key < node.getValue())
				return find(node.getLeft(), key);
			else if (key > node.getValue())
				return find(node.getRight(), key);
			else
				return node;
		}

	}

	public void add(int key) {
		this.root = add(this.root, key);
	}

	private Node add(Node node, int key) {
		if (node == null)
			return new Node(key);
		else if (key < node.getValue())
			node.setLeft(add(node.getLeft(), key));
		else if (key > node.getValue())
			node.setRight(add(node.getRight(), key));
		else
			node.setValue(key);
		return node;
	}

	public void inOrder() {
		inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.println(node.getValue());
			inOrder(node.getRight());

		}

	}

	public int findMin() {
		return findMin(root);
	}

	public int findMax() {
		return findMax(root);
	}

	private int findMin(Node node) {
		if (node == null)
			return 0;
		else if (node.getLeft() != null)
			return findMin(node.getLeft());
		else
			return node.getValue();

	}

	private int findMax(Node node) {
		if (node == null)
			return 0;
		else if (node.getRight() != null)
			return findMax(node.getRight());
		else
			return node.getValue();

	}

	public Node parentNode(int key) {
		return parentNode(root, find(key));
	}

	private Node parentNode(Node currentNode, Node keyNode) {
		if (currentNode == keyNode || currentNode == null)
			return null;
		else {
			if (currentNode.getLeft() == keyNode || currentNode.getRight() == keyNode)
				return currentNode;
			else {
				if (currentNode.getValue() < keyNode.getValue())
					return parentNode(currentNode.getRight(), keyNode);
				else
					return parentNode(currentNode.getLeft(), keyNode);
			}
		}

	}

	// Finding successor
	/*
	 * 
	 * 1.if x:right = NIL 2.return TREE-MINIMUM.x:right/ 3.y D x:p 4 while y ¤
	 * NIL and x == y:right 5 x D y 6 y D y:p 7 return y
	 * 
	 */

	public int successor(int key) {
		return successor(find(key));
	}

	private int successor(Node node) {
		if (node.getRight() != null)
			return findMin(node.getRight());
		else {
			Node y = parentNode(node.getValue());
			Node x = node;
			while (parentNode(x.getValue()) != null & parentNode(x.getValue()).getRight() == x) {
				x = y;
				y = parentNode(y.getValue());
			}
			return y.getValue();
		}

	}

	public void printTree() {
		printSubtree(root);
	}

	public void printSubtree(Node node) {
		if (node.getRight() != null) {
			printTree(node.getRight(), true, "");
		}
		printNodeValue(node);
		if (node.getLeft() != null) {
			printTree(node.getLeft(), false, "");
		}
	}

	private void printNodeValue(Node node) {
		if (node.getValue() == 0) {
			System.out.print("<0>");
		} else {
			System.out.print(node.getValue());
		}
		System.out.println();
	}

	private void printTree(Node node, boolean isRight, String indent) {
		if (node.getRight() != null) {
			printTree(node.getRight(), true, indent + (isRight ? "        " : " *      "));
		}
		System.out.print(indent);
		if (isRight) {
			System.out.print(" /");
		} else {
			System.out.print(" \\");
		}
		System.out.print("*****");
		printNodeValue(node);
		if (node.getLeft() != null) {
			printTree(node.getLeft(), false, indent + (isRight ? " *      " : "        "));
		}
	}

	public void delete(int key) {
		// delete(root,key);
		root = delete(root, key);
	}

	private Node delete(Node node, int key) {
		if (node == null)
			return node;
		if (key < node.getValue()) {
			
			node.setLeft(delete(node.getLeft(), key));
			printSubtree(node);
			//System.out.println("=============================");
		} else if (key > node.getValue()) {
			node.setRight(delete(node.getRight(), key));
			printSubtree(node);
		} else {
			if (node.getLeft() == null)
				return node.getRight();
			else if (node.getRight() == null)
				return node.getLeft();

			int successor = successor(node.getValue());
			node.setValue(successor);
			node.setRight(delete(node.getRight(), node.getValue()));

		}
		return node;
	}

	public void levelOrderTraversal(){
		//levelOrderTraversal(root);
		System.out.println(levelOrder(root).toString());
	}
	
	// private Node delete(Node deleteNode) {
	// int key = deleteNode.getValue();
	// Node parentNode=parentNode(deleteNode.getValue());
	// if (deleteNode == null) {
	// System.out.println("Value Not present");
	// return null;
	// }
	//
	// if(deleteNode.getLeft()==null&&deleteNode.getRight()==null){
	// return deleteLeaf(deleteNode);
	// }
	// else if(deleteNode.getLeft()==null||deleteNode.getRight()==null){
	// Node singleChildNode=singleChildNode(deleteNode);
	// boolean isLeftParent=isLeftParent(parentNode,deleteNode);
	// if(!isLeftParent)
	// parentNode.setLeft(singleChildNode);
	// else
	// parentNode.setRight(singleChildNode);
	// return deleteNode;
	//
	// }
	// else /*if(deleteNode.getLeft()!=null&&deleteNode.getRight()!=null)*/{
	// Node successor=find(successor(deleteNode.getValue()));
	// deleteNode.setValue(successor.getValue());
	// deleteNode.setRight(delete(successor));
	// return deleteNode;
	// }
	//
	// }

	private void levelOrderTraversal(Node root) {
		if(root==null)
			return;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node current = queue.poll();
	            System.out.print(current.getValue() + " ");
	            /*Enqueue left child */
	            if (current.getLeft() != null) {
	                queue.add(current.getLeft());
	            }else{
	            	System.out.print(null + " ");
	            }
	 
	            /*Enqueue right child */
	            if (current.getRight() != null) {
	                queue.add(current.getRight());
	            }else{
	            	System.out.print(null + " ");
	            }
		}
		
	}
	
	public List<List<Integer>> levelOrder(Node root) {
	    List<List<Integer>> al = new ArrayList<List<Integer>>();
	    List<Integer> nodeValues = new ArrayList<Integer>();
	    if(root == null)
	        return al;
	 
	    LinkedList<Node> current = new LinkedList<Node>();
	    LinkedList<Node> next = new LinkedList<Node>();
	    current.add(root);
	 
	    while(!current.isEmpty()){
	        Node node = current.remove();
	 
	        if(node.getLeft() != null)
	            next.add(node.getLeft());
	        if(node.getRight() != null)
	            next.add(node.getRight());
	        
	        
	        //printLinkedList("Current	:",current);
	        //printLinkedList("Next	:",next);
	        nodeValues.add(node.getValue());
	        
	        if(current.isEmpty()){
	            current = next;
	            next = new LinkedList<Node>();
	            al.add(nodeValues);
	            nodeValues = new ArrayList();
	        }
	 
	    }
	    Collections.reverse(al);
	    return al;
	}

	private void printLinkedList(String string, LinkedList<Node> node) {
		System.out.print(string+"[");
		for(Node n:node){
			System.out.print(n.getValue()+" ");
		}
		System.out.print("]\n");
		
	}

	private boolean isLeftParent(Node parentNode, Node childNode) {
		if (childNode.getValue() < parentNode.getValue())
			return false;
		else
			return true;
	}

	private Node singleChildNode(Node node) {
		if (node.getLeft() != null)
			return node.getLeft();
		else
			return node.getRight();
	}

	private Node deleteLeaf(Node leafNode) {
		Node parentNode = parentNode(leafNode.getValue());
		System.out.println("Parent :" + parentNode.getValue());
		System.out.println("Leaf   :" + leafNode.getValue());
		if (leafNode.getValue() < parentNode.getValue())
			parentNode.setLeft(null);
		else
			parentNode.setRight(null);
		System.out.println("Deleted Leaf Node	:	" + leafNode.getValue());
		return leafNode;

	}

}
