package com.lwl.Array.Queue;

public class Test1QueueTest {
	public static void main(String[] args) {
		//创建一个队列
		Test1Queue test1Queue = new Test1Queue();
		//入队
		test1Queue.add(9);
		test1Queue.add(8);
		test1Queue.add(7);
		test1Queue.add(6);
		test1Queue.add(5);
		//出队
		System.out.println(test1Queue.poll());
		System.out.println(test1Queue.poll());
		System.out.println(test1Queue.poll());
		System.out.println(test1Queue.poll());
		System.out.println(test1Queue.poll());
		test1Queue.add(8);
		System.out.println(test1Queue.isEmpty());
	}
}