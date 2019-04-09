package com.lwl.Sort;

import java.util.Arrays;

/*
 * 冒泡排序
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 14, 191, 143, 146, 767, 1230, 6518, 123, 2, 15 };
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

/*
 * 冒泡排序
 * 总共比较length-1次
 */
	public static void bubblesort(int[] arr) {
		 //控制一共比较多少轮
		//总共要比较数组长度-1轮，最后一个不需要比较
		for (int i = 0; i < arr.length-1; i++) {
			//比较过的就不需要再比较了，再遍历一次-i
			for (int j = 0; j < arr.length-1-i; j++) {
				//如果j的数大于j后面的数
				if (arr[j]>arr[j+1]) {
					//就把j放到temp里面
					int temp = arr[j];
					//然后j的位置等于j+1的位置
					arr[j]=arr[j+1];
					//而j+1的位置等于以前j(temp)的位置
					arr[j+1]=temp;
				}
			}
		}
	}
}
