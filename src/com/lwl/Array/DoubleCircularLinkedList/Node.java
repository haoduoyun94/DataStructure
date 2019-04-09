package com.lwl.Array.DoubleCircularLinkedList;

//双向循环链表
//如果只建立一个节点直接等于this
public class Node {
	//定义上一个节点
	Node upNode=this;
	//定义下一个节点
	Node nextNode=this;
	//创建节点数据
	int data;
	
	//Node构造方法
	public Node(int data) {
		this.data=data;
	}
	
	//增加节点
	public void after(Node data) {
		//原来的下一个节点
		Node nextNext = nextNode;
		//把新节点作为当前节点的下一个节点
		this.nextNode=data; 
		//把当前节点作为新节点的前一个节点
		data.upNode = this;
		//让原来的下一个节点作为新节点的下一个节点
		data.nextNode= nextNext;
		//原来的下一个节点的上一个节点为新节点
		nextNext.upNode=data;	
	}
	
	//下一个节点
	public Node nextNode() {
		return this.nextNode;
	}
	
	//上一个节点
	public Node upNode() {
		return this.nextNode;
	}
	
	//获取节点数据
	public int getNode() {
		return this.data; 
	}
	
}
