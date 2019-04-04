package com.lwl.Array.BasicArray;

//获取数组下标元素
public class Test1Array {
	public static void main(String[] args) {
		// 创建一个数组
		int[] arr1 = new int[3];
		// 获取数组长度
		int length = arr1.length;
		System.out.println("arr1长度"+length);
		//访问数组元素:数组名[下标]  从0开始
		int element =  arr1[0];
		System.out.println("arr1第一个元素"+element);
		//为数组元素赋值
		arr1[0] = 99;
		System.out.println("arr1第一个元素"+arr1[0]);
		arr1[1]=98;
		arr1[2]=97;
		//遍历数组
		for(int i = 0;i<length;i++) {
			System.out.println("arr1的元素"+":"+arr1[i]);
		}
		//创建数组的同时为数组赋值
		int[] arr2 = new int[]{90,80,70,60,50};
		//获取数组的长度
		System.out.println(arr2.length);
	}
}
