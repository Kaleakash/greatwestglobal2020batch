package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loaded...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
