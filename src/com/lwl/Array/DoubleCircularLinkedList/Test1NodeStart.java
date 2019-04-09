package com.lwl.Array.DoubleCircularLinkedList;

public class Test1NodeStart {
	public static void main(String[] args) {
		// 创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		//增加节点
		n1.after(n2);
		n2.after(n3);
		//查看上一个下一个节点
		System.out.println(n2.upNode.getNode());
		System.out.println(n2.getNode());
		System.out.println(n2.nextNode.getNode());
		System.out.println(n1.upNode.getNode());
		System.out.println(n2.nextNode.getNode());
	}
	

}
