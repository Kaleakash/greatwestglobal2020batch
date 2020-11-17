package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int num[]= {2,6,1,5,3,9,8};
		System.out.println("Before sort using loop");
		for(int n:num) {
			System.out.println(n);
		}
		Arrays.sort(num);
		
		System.out.println("After sort");
		for(int n:num) {
			System.out.println(n);
		}
		
	}

}
