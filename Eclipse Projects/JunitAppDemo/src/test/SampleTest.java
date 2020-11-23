package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After all test method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Every test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Every test method");
	}

	@Test
	public void test() {
		System.out.println("First test method");
	}

	@Test
	public void test1() {
		System.out.println("Second test method");
	}
	@Test
	public void test2() {
		System.out.println("Third test method");
	}
}
