package com.lwl.Array.ObjectOrientedArray;

public class Test2DeleteTest {
	public static void main(String[] args) {
		// 创建一个可变的数组
		Test1Delete tDelete = new Test1Delete();
		// 获取长度
		Object size = tDelete.size();
		System.out.println(size);
		// 往可变数组中加入元素
		tDelete.add("阿斯顿马丁");
		tDelete.add("豪车");
		tDelete.add("买不起");
		// 调用删除元素方法
		tDelete.delete(2);
		// 显示可变数组的元素到控制台
		tDelete.show();
		// 调用获取某个下标元素的方法
		System.out.println(tDelete.get(1));
		System.out.println("===========================");
		tDelete.add(1);
		tDelete.add(2);
		tDelete.add(3);
		tDelete.add(5);
		tDelete.add(6);
		tDelete.show();
		tDelete.insert(5, 4);
		tDelete.show();
		System.out.println("===========================");
		// 替换指定位置的元素
		tDelete.set(1, "是豪车");
		tDelete.show();
	}
}
