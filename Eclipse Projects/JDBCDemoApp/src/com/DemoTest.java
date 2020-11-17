package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao ed = new EmployeeDao();
		//ed.retrieveEmployeeInfo();
		//ed.storeEmployee();
		//ed.deleteEmployeeById();
		//ed.updateEmployeeSalary();
		//ed.storeEmployee(1, "Ajay", 32000);
		//ed.storeEmpInfoUsingPrepared(3, "Balaji", 24000);
		//ed.retrieveEmpInfoBySalaryCondition(12000);
		ed.updateRecordUsingPrepared(10, 42000);
	}

}
