package com.srikanth.Recursion;

public class LinkedList {

	private Node head;

	private static class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public void add(Node entry) {
		if (head== null) {
			head = entry;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				temp.next = entry;
			}

		}

	}

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		Node head = new Node(5);
		list.add(head);
		list.add(new Node(6));
		list.add(new Node(7));
		list.add(new Node(1));
		list.add(new Node(2));

		list.printList(head);
		// Reversing LinkedList
		// Node reverseHead=reverseLinkedList(head);
		System.out.println("After reversing");
		// list.printList(reverseHead);

	}

}
