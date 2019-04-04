package com.lwl.Array.ObjectOrientedArray;

import java.util.Arrays;

//面向对象数组
public class Test1Delete {
	// 用于存储的数组
	private Object[] elements;

	public Test1Delete() {
		elements = new Object[0];
	}

	// 获取数组长度的方法
	public Object size() {
		return elements.length;
	}

	// 往数组末尾添加元素
	public void add(Object ys) {
		// 创建一个新的数组
		Object[] newArr = new Object[elements.length + 1];
		// 把原数组的元素复制的新的数组中
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		// 把添加的元素放到数组中
		newArr[elements.length] = ys;
		// 使用新数组替换旧数组
		elements = newArr;

	}

	// 查看可变数组的元素
	public void show() {
		System.out.println(Arrays.toString(elements));
	}

	// 删除一个可变数组中的元素
	// int index 位置
	public void delete(int index) {
		// 判断下标是否越界
		if (index < 0 || index > elements.length - 1) {
			throw new RuntimeException("下标越界");
		}
		// 创建一个新的数组
		Object[] newArr = new Object[elements.length - 1];
		// 把原数组的元素复制的新的数组中
		for (int i = 0; i < newArr.length; i++)
			// 要删除元素之前的元素
			if (i < index) {
				newArr[i] = elements[i];
			} else {
				newArr[i] = elements[i + 1];
			}
		// 新数组替换旧数组
		elements = newArr;
	}

	// 获取某个下标的元素
	public Object get(int index) {
		return elements[index];
	}

	// 插入元素到指定位置
	public void insert(int index, Object ys) {
		// 判断下标是否越界
		if (index < 0 || index > elements.length - 1) {
			throw new RuntimeException("下标越界");
		}
		// 创建一个新的数组
		Object[] newArr = new Object[elements.length + 1];
		// 将元素组放到新的数组中
		for (int i = 0; i < elements.length; i++) {
			// 目标之前的元素
			if (i < index) {
				newArr[i] = elements[i];
			} else {
				newArr[i + 1] = elements[i];
			}
		}
		// 插入新的元素
		newArr[index] = ys;
		// 新数组替换旧数组
		elements = newArr;

	}

	// 替换指定位置的元素
	public void set(int index, Object ys) {
		// 判断下标是否越界
		if (index < 0 || index > elements.length - 1) {
			throw new RuntimeException("下标越界");
		}
		elements[index] = ys;
	}

	// 线性查找
	public Object search(Object ys) {
		// 遍历数组
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == ys) {
				return i;
			}
		}
		//没有找到对应元素返回-1
		return -1;
	}

	// 二分法查找
	public Object dichotomy(Object ys) {
		// 来记录开始位置
		int begin = 0;
		// 记录结束位置
		int end = elements.length - 1;
		// 记录中间位置
		int zj = (begin + end) / 2;
		// 循环查找
		while (true) {
			//如果没有这个元素，返回-1
			if (begin>=end) {
				return -1;
			}
			// 判断中间这个元素是否是目标元素
			if (elements[zj] == ys) {
				return ys;
				// 中间的元素不是要查找的元素
			} else {
				// 判断中间这个元素是不是比目标元素大
				if ((int) (elements[zj]) > (int) ys) {
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
	}
}