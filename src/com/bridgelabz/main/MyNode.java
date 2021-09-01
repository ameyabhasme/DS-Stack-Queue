package com.bridgelabz.main;

public class MyNode<T> implements INode<T> {

	private T data;
	private INode<T> next;

	MyNode() {
	}

	public MyNode(T data) {
		this.setData(data);
		this.setNext(null);
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public T getData() {
		return data;
	}

	@Override
	public void setNext(INode<T> next) {
		this.next = next;
	}

	@Override
	public INode<T> getNext() {
		return next;
	}

}
