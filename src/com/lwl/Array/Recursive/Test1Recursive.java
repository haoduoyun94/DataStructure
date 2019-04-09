package com.lwl.Array.Recursive;

/*
 * 递归
 * 在一个方法（函数）的内部调用该方法（函数）本身的编程方式
 */
public class Test1Recursive {
	public static void main(String[] args) {
		print(1);
	}
	
	//递归操作
	public static void print(int i) {
		if (i < 10) {
			System.out.println(i);
			print(i + 1);
		}
	}
}