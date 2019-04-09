package com.lwl.Sort;

import java.util.Arrays;

//快速排序
public class QuickSort {
	public static void main(String[] args) {
		// 创建一个数组进行排序
		int[] arr = new int[] { 94, 484, 849, 131, 651, 13, 156, 84, 84, 8 };
		//quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quicksort(int[] arr, int start, int end) {
		if (start < end) {
			// 把数组中的第0个数字作为标准数
			int stard = arr[start];
			// 记录需要排序的下标
			int low = start;
			int high = end;
			// 循环找到比标准数大的数和小的数
			while (low < high) {
				// 右边的数字比标准数大
				while (low < high && stard <= arr[high]) {
					high--;
				}
				// 使用右边的数字替换左边的数字
				arr[low] = arr[high];
				// 如果左边的数字比标准数小
				while (low < high && arr[low] <= stard) {
					low++;
				}
				arr[high] = arr[low];
			}
			// 把标准数赋给低所在的位置的元素
			arr[low] = stard;
			// 处理所有小的数字
			quicksort(arr, start, low);
			// 处理所有大的数字
			quicksort(arr, low + 1, end);
		}
	}
}