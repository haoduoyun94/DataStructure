package com.lwl.Array.SingleLinker;

public class Test2Node {
	public static void main(String[] args) {
		//创建节点
		Node data1 = new Node(1);
		Node data2 = new Node(2);
		Node data3 = new Node(3);
		Node data4 = new Node(4);
		//追加节点
		data1.append(data2).append(data3).append(data4);
		//取出下一个节点的数据
		System.out.println(data1.next().next().next().getData());
		//插入一个新的节点
		Node data5 = new Node(5);
		data1.next().after(data5);
		data1.show(); 
		//删除节点(删除的是下一个节点)
		data1.next().removeNext();
		data1.show();
		System.out.println(data1.next().next().isLast());
	}

}
