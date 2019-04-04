package com.lwl.Array.BasicArray;

import java.util.Arrays;

//删除指定位置的元素
public class Test3DeleteArray {
	public static void main(String[] args) {
		// 如何删除数组中的元素
		int[] arr = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// 要删除元素的下标3
		int ys = 5;
		System.out.println("原数组" + Arrays.toString(arr));
		// 创建一个新的数组，长度是原数组长度减掉删除元素的长度
		int[] newArr = new int[arr.length - 1];
		// 复制原数组其他没有被删除的元素
		for (int i = 0; i < newArr.length; i++) {
			// 要删除元素之前的元素
			if (i < ys) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[i + 1];
			}
		}
		// 创建新数组代替原数组
		arr = newArr;
		System.out.println("新数组" + Arrays.toString(newArr));
	}

}
