package com.lwl.Array.SearchAlgoithm;

//线性查找
public class LinearSearch {
	public static void main(String[] args) {
		// 创建一个目标数组
		int[] arr = new int[] { 0, 1, 2, 3, 4, 5 };
		// 需要查找的目标元素
		int aims = 4;
		// 目标元素不存在打印的结果
		int index = -99999999;
		// 判断下标是否越界
		if (index < 0 || index > arr.length - 1) {
			throw new RuntimeException("下标越界");
		}
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == aims) {
				index = i;
				break;
			}
		}
		// 打印目标元素的下标
		System.out.println("目标元素:" + index);
	}

}
