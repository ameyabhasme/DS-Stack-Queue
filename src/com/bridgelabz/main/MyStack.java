package com.bridgelabz.main;

public class MyStack<T> {
	MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

	public void push(INode<Integer> newNode) {
		myLinkedList.add(newNode);
	}

	public INode<Integer> peek() {
		return myLinkedList.head;
	}

	public INode<Integer> pop() {
		return myLinkedList.popFirst();
	}
}
