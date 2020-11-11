package com;

public class StringDemoTest {

	public static void main(String[] args) {
		String str = "Welcome to Java Training";
		/*String str1="UI Training";
		System.out.println(str.contains("Java"));
		System.out.println(str.toLowerCase());
		System.out.println(str);
		str = str + str1;
		System.out.println(str);
		System.out.println("10"+10);
		System.out.println(10+"10"+10);
		System.out.println(10+10);*/
		System.out.println(str);
		System.out.println(str.substring(2));
		System.out.println(str);
		StringBuffer sb = new StringBuffer("Welcome to Java Training");
		System.out.println(sb);
		System.out.println(sb.append(" and UI Training"));
		System.out.println(sb.insert(25,"Database "));
	}
}
