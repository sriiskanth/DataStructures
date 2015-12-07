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
	
	
	public int findMin(){
		 return findMin(root);
	}

	
	public int findMax(){
		 return findMax(root);
	}

	private int  findMin(Node node) {
		if(node==null)
			return 0;
		else if(node.getLeft()!=null)
			return findMin(node.getLeft());
		else 
			return node.getValue();
		
	}
	
	
	private int  findMax(Node node) {
		if(node==null)
			return 0;
		else if(node.getRight()!=null)
			return findMax(node.getRight());
		else 
			return node.getValue();
		
	}
	
	
	public Node parentNode(int key){
		return parentNode(root,find(key));
	}

	private Node parentNode(Node currentNode, Node keyNode) {
		if(root==keyNode||currentNode==null)
		return null;
		else{
			if(currentNode.getLeft()==keyNode||currentNode.getRight()==keyNode)
				return currentNode;
			else {
				if(currentNode.getValue()<keyNode.getValue())
					return parentNode(currentNode.getRight(),keyNode);
				else 
					return parentNode(currentNode.getLeft(),keyNode);
			}
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

}
