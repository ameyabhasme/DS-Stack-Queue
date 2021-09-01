package com.bridgelabz.main;

public class MyLinkedList<T extends Comparable<T>> {
	public INode<T> head;
	public INode<T> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<T> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			head = newNode;
		} else {
			INode<T> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<T> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (tail != null) {
			this.tail.setNext(newNode);
		}
		tail = newNode;
	}

	public void insertNode(INode<Integer> myFirstNode, INode<Integer> mySecondNode) {
		mySecondNode.setNext(myFirstNode.getNext());
		myFirstNode.setNext(mySecondNode);
	}

	public INode<T> popFirst() {
		INode<T> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	public INode<T> popLast() {
		INode<T> tempNode = head;
		while (!(tempNode.getNext().equals(tail))) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode<T> searchNode(T key) {
		INode<T> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getData() == key) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void popNode(T key) {
		INode<T> tempNode = head;
		while (tempNode.getNext().getData() != key) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(tempNode.getNext().getNext());
	}

	public int getSize() {
		int size = 0;
		INode<T> tempNode = head;
		while (tempNode != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
	}

	public void sortedLinkedList(INode<T> newNode) {
		INode<T> tempNode = head;
		INode<T> prevNode = null;
		while (tempNode != null && (newNode.getData()).compareTo((T) tempNode.getData()) > 0) {
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
		if (prevNode == null) {
			this.head = newNode;
		} else {
			prevNode.setNext(newNode);
		}
		newNode.setNext(tempNode);
		while (tempNode != null) {
			this.tail = tempNode;
			tempNode = tempNode.getNext();
		}
	}
}
