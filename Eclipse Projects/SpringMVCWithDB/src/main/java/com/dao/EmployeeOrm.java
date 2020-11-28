package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeOrm {

@Autowired
EntityManagerFactory factory;					//JPA : EntityManagerFactory :DataSource 
																	/*Connection con;
																	 * 
																	 * 
																	 * 
																	 */

public List<Employee> getAllEmployee() {
													
	EntityManager manager = factory.createEntityManager();	// PreparedStatement , Statement 
	Query qry = manager.createQuery("from Employee");		//Equal to ResultSet Employee is not a table it JavaBean class  JPQL 
	//Query qry1 = manager.createQuery("select ")
	return qry.getResultList();													// object in the form of List
		
}

public  int storeEmployee(Employee emp) {
	//emp.setEmpId(callMethod());
	EntityManager manager = factory.createEntityManager();
	EntityTransaction tran = manager.getTransaction();
	tran.begin();
			manager.persist(emp);								// save the records through ORM by default not auto commit. 
	tran.commit();
	Employee employee = manager.find(Employee.class, emp.getEmpId());		//we will get the object 
		if(employee!=null) {
			return 1;
		}else {
			return 0;
		}
}
}
