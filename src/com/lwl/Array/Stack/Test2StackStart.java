package com.lwl.Array.Stack;

public class Test2StackStart {
	public static void main(String[] args) {
		// 创建一个栈
		Test1Stack test1Stack = new Test1Stack();
		// 放入数据
		test1Stack.push(1);
		test1Stack.push(2);
		test1Stack.push(3);
		test1Stack.push(4);
		test1Stack.push(5);
		// 取出栈顶元素
		System.out.println(test1Stack.pop());
		test1Stack.pop();
		System.err.println(test1Stack.peek());
		test1Stack.isEmpty();
	}
}
