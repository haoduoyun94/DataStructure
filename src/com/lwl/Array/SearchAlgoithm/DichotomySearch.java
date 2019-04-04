package com.lwl.Array.SearchAlgoithm;

//二分法查找,折半查找
public class DichotomySearch {
	public static void main(String[] args) {
		// 创建目标数组，目标数组是升序有序的
		int arr[] = new int[] { 0, 1, 2, 3, 4, 5 };
		// 目标元素
		int aims = 6;
		// 来记录开始位置
		int begin = 0;
		// 记录结束位置
		int end = arr.length - 1;
		// 记录中间位置
		int zj = (begin + end) / 2;
		// 记录目标位置
		int index = -1;
		// 判断下标是否越界
		if (index < 0 || index > arr.length - 1) {
			throw new RuntimeException("下标越界");
		}
		// 循环查找
		while (true) {
			// 判断中间这个元素是否是目标元素
			if (arr[zj] == aims) {
				index = zj;
				break;
				// 中间的元素不是要查找的元素
			} else {
				// 判断中间这个元素是不是比目标元素大
				if (arr[zj] > aims) {
					// 把结束位置中间前面一位
					end = zj - 1;
					// 中间元素比目标元素要小
				} else {
					// 修改开始位置为中间位置的后一个位置
					begin = zj + 1;
				}
				// 取出新的中间位置
				zj = (begin + end) / 2;
			}
		}
		System.out.println("查找的元素：" + index);
	}
}
