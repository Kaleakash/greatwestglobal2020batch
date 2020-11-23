package com;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now(); //today date 
		System.out.println(ld1);
		System.out.println(ld1.getDayOfMonth());
		System.out.println(ld1.getMonthValue());
		System.out.println(ld1.getYear());
		LocalDate ld2 = LocalDate.of(2021, Month.DECEMBER, 30);
		System.out.println(ld2);
		System.out.println(ld2.plusDays(20));
		System.out.println(ld2.plusMonths(2));
	}

}
