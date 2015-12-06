package com.srikanth.Trees;

public class BinarySearchTree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public Node  find(int key){
		return find(this.root,key);
	}

	private Node find(Node node, int key) {
		if(node==null)
			return null;
		else if (key<node.getValue())
			find(node.getLeft(),key);
		else if(key>node.getValue())
			find(node.getRight(),key);
		else return node;

		return null;
	}
	
	
	public void add(int key){
		this.root=add(this.root,key);
	}

	private Node add(Node node, int key) {
		if(node==null)
			return new Node(key);
		else if(key<node.getValue())
			node.setLeft(add(node.getLeft(),key));
		else if(key>node.getValue())
			node.setRight(add(node.getRight(),key));
		else
			node.setValue(key);
		return node;
	}
	
	public void inOrder(){
		inOrder(this.root);
	}
	
	private void inOrder(Node node) {
		if(node!=null){
			inOrder(node.getLeft());
			System.out.println(node.getValue());
			inOrder(node.getRight());
				
		}
		
	}
	
}
