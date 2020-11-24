package com;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController								// @RestController = @Controller + @ResponseBody
public class EmployeeController {

	    //http://localhost:9090/sayRest
		@GetMapping(value = "sayRest")
		public String sayHello() {
			return "Welcome Rest Controller ";
		}
		//http://localhost:9090/empDetails
		@GetMapping(value = "empDetails",produces = MediaType.APPLICATION_JSON_VALUE)
		public Employee getEmployee() {
			Employee emp = new Employee();
			emp.setId(100);
			emp.setName("Ravi");
			emp.setSalary(15000);
			return emp;
		}
		//http://localhost:9090/empAllDetails
		@GetMapping(value = "empAllDetails",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getEmployees() {
			List<Employee> listOfEmp = new ArrayList<Employee>();
			Employee emp1 = new Employee();
			emp1.setId(100);		emp1.setName("Ravi");		emp1.setSalary(15000);
			Employee emp2 = new Employee();
			emp2.setId(101);	emp2.setName("Ramesh");	emp2.setSalary(16000);
			Employee emp3 = new Employee();
			emp3.setId(102);	emp3.setName("Rajesh");	emp3.setSalary(18000);
			listOfEmp.add(emp1); listOfEmp.add(emp2); listOfEmp.add(emp3);
			return listOfEmp;
		}
		
		
		//       http://localhost:9090/qry?name=Ravi&age=15 by default html form if method is get 
							// it use query param concept. 
		@GetMapping(value = "qry")
		public String getQueryParamInfo(@RequestParam("name") String name, @RequestParam("age") int age) {
			if(age>21) {
				return "User "+name+"You are eligible to vote";
			}else {
				return "User "+name+"You are not eligible to vote, becauser you age is "+age;
			}
		}
		//    http://localhost:9090/path/Ramesh/15			Client command line interface or angular or react js 
		@GetMapping(value = "path/{name}/{age}")
		public String getPathParamInfo(@PathVariable("name") String name, @PathVariable("age") int age) {
			if(age>21) {
				return "User "+name+"You are eligible to vote";
			}else {
				return "User "+name+"You are not eligible to vote, because your age is "+age;
			}
		}
		
		// http://localhost:9090/empStore   pass the json data through body part {"id":100,"name":"Ramesh","salary":15000}
		@PostMapping(value = "empStore",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeEmpInfo(@RequestBody Employee emp) {	//@RequestBody annotation is use to receive 
					System.out.println("Your id is "+emp.getId());					//data from request body in the form of json 
					System.out.println("Your Name is "+emp.getName());
					System.out.println("Your Salary is "+emp.getSalary());
			return "Welcome User "+emp.getName();
		}
		
		// http://localhost:9090/empModify   pass the json data through body part {"id":100,"name":"Ramesh","salary":15000}
				@PostMapping(value = "empModify",consumes = MediaType.APPLICATION_JSON_VALUE,
						produces = MediaType.APPLICATION_JSON_VALUE)
				public Employee storeEmpModify(@RequestBody Employee emp) {	//@RequestBody annotation is use to receive 
							emp.setName("Mr "+emp.getName());
							emp.setSalary(emp.getSalary()+5000);
							
							return emp;
				}
				
				// http://localhost:9090/empModifyEmp   pass the json data through body part {"id":100,"name":"Ramesh","salary":15000}
				@PutMapping(value = "empModifyEmp",consumes = MediaType.APPLICATION_JSON_VALUE,
						produces = MediaType.APPLICATION_JSON_VALUE)
				public Employee storeEmpModifyDetails(@RequestBody Employee emp) {	//@RequestBody annotation is use to receive 
							emp.setName("Mr "+emp.getName());
							emp.setSalary(emp.getSalary()+5000);
							
							return emp;
				}
				// http://localhost:9090/empDeleteInfo/100		Getting null value 
				@DeleteMapping(value = "empDeleteInfo/{id}")
				public String deleteEmpInfo(@PathParam("id") int id) {
					
					return "Your record deleted successfully with id as "+id;
				}
}
