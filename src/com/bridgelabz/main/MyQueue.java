package com.bridgelabz.main;

public class MyQueue<T> {
	MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

	public void enqueue(INode<Integer> newNode) {
		myLinkedList.append(newNode);
	}

	public INode<Integer> peek() {
		return myLinkedList.head;
	}

	public INode<Integer> dequeue() {
		return myLinkedList.popFirst();
	}
}
