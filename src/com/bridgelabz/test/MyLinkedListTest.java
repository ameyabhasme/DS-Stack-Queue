package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.INode;
import com.bridgelabz.main.MyNode;
import com.bridgelabz.main.MyStack;

public class MyLinkedListTest {
	static MyStack<Integer> stack = new MyStack<>();
	MyNode<Integer> myFirstNode, mySecondNode, myThirdNode;

	@Test
	public void ifStackIsCreated_ReturnTrue() {
		myFirstNode = new MyNode<>(56);
		mySecondNode = new MyNode<>(30);
		myThirdNode = new MyNode<>(70);
		stack.push(myThirdNode);
		stack.push(mySecondNode);
		stack.push(myFirstNode);
		INode<Integer> peek = stack.peek();
		Assert.assertEquals(peek, myFirstNode);
	}

	@Test
	public void IfStackPopOrPeek_ReturnTrue() {
		myFirstNode = new MyNode<>(56);
		mySecondNode = new MyNode<>(30);
		myThirdNode = new MyNode<>(70);
		stack.push(myThirdNode);
		stack.push(mySecondNode);
		stack.push(myFirstNode);
		INode<Integer> popStack = stack.pop();
		Assert.assertEquals(popStack, myFirstNode);
	}

}
