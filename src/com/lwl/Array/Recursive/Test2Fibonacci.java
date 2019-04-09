package com.lwl.Array.Recursive;

//斐波那契数列  1 1 2 3 5 8 13 21 ..........
public class Test2Fibonacci {
	public static void main(String[] args) {
		int i = febonacci(3);
		System.out.println(i);
	}

	// 打印第n项
	public static int febonacci(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return febonacci(i - 1) + febonacci(i - 2);

		}

	}
}
