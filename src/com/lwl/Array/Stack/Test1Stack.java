package com.lwl.Array.Stack;

public class Test1Stack {
	// 栈的底层来存储数据
	int[] elements;

	public Test1Stack() {
		elements = new int[0];
	}

	// 放入元素的方法push
	public void push(int ys) {
		// 创建一个新的数组
		int[] newArr = new int[elements.length + 1];
		// 把原有数组中的元素复制到新数组中
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		// 把添加的元素放到新数组中
		newArr[elements.length] = ys;
		// 替换数组
		elements = newArr;
	}

	// 取出栈顶的元素
	public int pop() {
		if (elements.length == 0) {
			throw new RuntimeException("栈为空");
		}
		// 取出数组的最后一个元素
		int ys = elements[elements.length - 1];
		// 创建一个新的数组
		int[] newArr = new int[elements.length - 1];
		// 原数组中除了最后一个元素，其他元素都放入新的数组
		for (int i = 0; i < elements.length - 1; i++) {
			newArr[i] = elements[i];
		}
		// 替换数组
		elements = newArr;
		// 返回栈顶元素
		return ys;
	}

	// 查看栈顶元素
	public int peek() {
		if (elements.length == 0) {
			throw new RuntimeException("栈为空");
		}
		return elements[elements.length - 1];
	}

	// 判断栈是否为空
	public boolean isEmpty() {
		return elements.length == 0;
	}
}
