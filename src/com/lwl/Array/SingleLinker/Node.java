package com.lwl.Array.SingleLinker;

//一个节点
public class Node {

	// 节点内容
	int data;
	// 下一个节点
	Node next;

	public Node(int data) {
		this.data = data;
	}

	// 为节点追加节点
	public Node append(Node data) {
		// 当前节点
		Node dqNode = this;
		while (true) {
			// 取出下一个节点赋给当前节点
			Node nextNode = dqNode.next;
			// 如果下一个节点为null
			if (nextNode == null) {
				break;
			}
			// 赋给当前节点
			dqNode = nextNode;
		}
		// 把追加的节点放到当前节点的下一个节点
		dqNode.next = data;
		return this;
	}
	
	//获取下一个节点
	public Node next() {
		return this.next;
	}
	
	//获取节点的数据
	public int getData() {
		return this.data;
	}
	
	//删除一个节点
	public void removeNext() {
		//取出下下一个节点
		Node newnext =  next.next;
		this.next = newnext;
		
	}
	
	//查看当前是否为最后一个节点
	public boolean isLast() {
		return next ==null;
	}
	
	//查看节点数据信息
	public void show() {
		Node dqNode = this;
		while(true) {
			System.out.print(dqNode.data+"  ");
			//取出下一个节点
			dqNode = dqNode.next;
			//如果是最后一个节点结束循环
			if (dqNode == null) {
				break;
			}
		}
		System.out.println();
	}
	
	//插入一个节点,作为当前节点的下一个节点
	public void after(Node node) {
		//取出下一个节点,作为下下一个节点
		Node nextNext = next;
		//把新节点作为当前节点的下一个节点
		this.next = node;
		//把下下一个节点作为新节点的下一个节点
		node.next = nextNext; 
	}

}
