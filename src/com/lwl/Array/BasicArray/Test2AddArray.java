package com.lwl.Array.BasicArray;

import java.util.Arrays;

//数组添加元素
public class Test2AddArray {
	public static void main(String[] args) {
		//解决数组的长度不可变
		int[] arr = new int [] {9,8,7};
		//快速查看数组元素
		System.out.println(Arrays.toString(arr));
		//要加入数组的元素
		int ys = 6;
		//创建一个新的数组，长度是原数组+1
		int[] newArr = new int[arr.length+1];
		//把原数组的元素放到新数组中
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		//把新的元素放到新数组的最后
		newArr[arr.length]=ys;
		//新数组替换掉原数组
		arr=newArr;
		System.out.println(Arrays.toString(arr));
	}

}
