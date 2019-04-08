package com.lwl.Array.Queue;

//队列
public class Test1Queue {
	// 构造方法
	int[] elements;

	public Test1Queue() {
		elements = new int[0];
	}

	// 入队
	public void add(int ys) {
		// 创建一个新的数组
		int[] newArr = new int[elements.length + 1];
		// 把原有的数组放到新的数组中
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		// 把元素放入新的数组
		newArr[elements.length] = ys;
		// 替换旧数组
		elements = newArr;
	}

	// 出队
	public int poll() {
		// 把数组的第0个元素取出
		int ys = elements[0];
		// 创建一个新的数组
		int newArr[] = new int[elements.length - 1];
		// 复制原有的数组到新的数组中
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = elements[i + 1];
		}
		// 替换数组
		elements = newArr;
		return ys;
	}
	
	//判断队列是否为空
	public boolean isEmpty() {
		return elements.length==0;
	}
}
	