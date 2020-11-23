package com;

import java.time.LocalTime;

public class LocaTimeDemo {

	public static void main(String[] args) {
	LocalTime lt1 = LocalTime.now();
	System.out.println(lt1);
	System.out.println(lt1.getHour()+" "+lt1.getMinute());
	System.out.println(lt1.plusHours(2));
	}

}
