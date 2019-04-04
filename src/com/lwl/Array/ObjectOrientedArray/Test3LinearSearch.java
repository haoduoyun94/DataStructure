package com.lwl.Array.ObjectOrientedArray;

public class Test3LinearSearch {
public static void main(String[] args) {
	Test1Delete linear = new Test1Delete();
	linear.add(1);
	linear.add(2);
	linear.add(3);
	linear.add(4);
	linear.add(5);
	linear.show();
	System.out.println("**************************************");
	//调用线性查找
	Object index = linear.search(4);
	System.out.println("查找的位置是:"+index);
	//二分法查找
	Object index1 = linear.dichotomy(4);
	System.out.println("查找的位置是:"+index1);
}
}
