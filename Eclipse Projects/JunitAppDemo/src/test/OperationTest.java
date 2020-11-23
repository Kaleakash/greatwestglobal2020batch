package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.Operation;

public class OperationTest {

	@Test
	public void testAdd() {
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300,result);
	}

}
