package com.lwl.Sort;

import java.util.Arrays;

public class DirectInsertionSort {
	public static void main(String[] args) {
		int arr[] = new int[] {4,5,8,9,2,1,8,8,2,7,2};
		zjinsertion(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//直接插入排序
	public static void zjinsertion(int[] arr) {
		//遍历一次所有数字
		for(int i=1;i<arr.length;i++) {
			//如果当前数字比前一个数字小
			if (arr[i]<arr[i-1]) {
				//把当前遍历的数字存储
				int temp = arr[i];
				//遍历当前数字前面的数字
				int j;
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					//把前一个数字赋给后一个数字
					arr[j+1]=arr[j];
				}
				//把临时变量（外层for循环的当前元素）赋给不满足条件的后一个值
				arr[j+1]=temp;
			} 
		}
	}

}
