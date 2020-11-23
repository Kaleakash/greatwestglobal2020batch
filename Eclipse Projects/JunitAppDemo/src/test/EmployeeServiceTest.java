package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.Employee;
import service.EmployeeService;

public class EmployeeServiceTest {

	static EmployeeService es;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		es = new EmployeeService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	//@Test
	public void testAddEmployee() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Balaji");
		emp.setSalary(22000);
		int res	= es.addEmployee(emp);
		assertEquals(1, res);
	}

	@Test
	public void testChangeSalary() {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setName("Balaji");
		emp.setSalary(22000);
		float salary = emp.getSalary();
		
		float updatedSalary = es.changeSalary(emp);
		assertEquals(salary+2000, updatedSalary,0.00);		//float value 
	}

	//@Test
	public void testGetEmployee() {
		//fail("Not yet implemented");
		Employee emp = es.getEmployee();
		assertNotNull(emp);
		assertEquals(100, emp.getId());
		assertEquals("Ravi", emp.getName());
		assertEquals(14000, emp.getSalary(),0.00);
	}

	//@Test
	public void testGetEmployees() {
		List<Employee> listOfEmp = es.getEmployees();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(1);
		assertNotNull(emp);
		assertEquals(101, emp.getId());
		assertEquals("Ramesh", emp.getName());
		assertEquals(16000, emp.getSalary(),0.00);
		
	}

}
