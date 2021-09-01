package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.INode;
import com.bridgelabz.main.MyNode;
import com.bridgelabz.main.MyStack;

public class MyLinkedListTest {

	@Test
	public void ifStackIsCreated_ReturnTrue() {
		MyStack<Integer> stack = new MyStack<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		stack.push(myThirdNode);
		stack.push(mySecondNode);
		stack.push(myFirstNode);
		INode<Integer> peek = stack.peek();
		Assert.assertEquals(peek, myFirstNode);
	}

}
