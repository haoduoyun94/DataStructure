package com.lwl.Array.CircularList;

public class TestNode {
	public static void main(String[] args) {
		//插入节点
		Node nt1 = new Node(1);
		Node nt2 = new Node(2);
		Node nt3 = new Node(3);
		Node nt4 = new Node(4);
		Node nt5 = new Node(5);
		//增加节点
		nt1.after(nt2);
		nt2.after(nt3);
		nt3.after(nt4);
		nt4.after(nt5);
		System.out.println(nt1.next().getData());
		System.out.println(nt2.next().getData());
		System.out.println(nt3.next().getData());
		System.out.println(nt4.next().getData());
		System.out.println(nt5.next().getData());
	}

}
