import java.util.*;
class Employee {
	int id;
	String name;
	float salary;
	Scanner obj = new Scanner(System.in);
	String skillSet[]=new String[10];
	int n;
	Address add = new Address();
	void read() {
		System.out.println("Enter the id");
		id = obj.nextInt();
		System.out.println("Enter the name");
		name = obj.next();
		System.out.println("Enter the salary");
		salary = obj.nextFloat();
		System.out.println("How many technologies do you know?");
		n = obj.nextInt();
		System.out.println("Plz enter all skill set one by one");
		for(int i=0;i<n;i++) {
			skillSet[i]=obj.next();
		}
	}
	void calSalary() {
		float hra = salary*0.10f;
		float da = salary*0.05f;
		float pf = salary*0.07f;
		salary = salary +hra +da -pf;
	}
	void display() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("All Skill Set Details are ");
		for(int i=0;i<n;i++) {
			System.out.println(skillSet[i]);
		}
	}	
}
class Programmer extends Employee {
	String projectName;
	void readPrg(){

	}
	void disPrg() {

	}
}
class Manager extends Employee {
	int numberOfEmp;
	void readMgr() {
		System.out.println("How many employee working under you!");
		numberOfEmp = obj.nextInt();
		add.readAddress();
	}
	void disMgr() {
		System.out.println("Number of Employee working under him "+numberOfEmp);
		add.disAddress();
	}
}
class Address {
	Scanner obj = new Scanner(System.in);
	String city;
	String state;
	void readAddress() {
		System.out.println("Enter the city");
		city = obj.next();
		System.out.println("Enter the state");
		state = obj.next();
	}
	void disAddress() {
	System.out.println("City is "+city);
	System.out.println("State is "+state);
	}
}
class EmployeeTest {
	public static void main(String args[]) {
	Manager mgr = new Manager();
	mgr.read();	
	mgr.readMgr();
		mgr.calSalary();
	mgr.display();
	mgr.disMgr();
	
	/*Employee emp1 = new Employee();
	emp1.read();
	emp1.calSalary();
	emp1.display();

	Employee emp2 = new Employee();
	emp2.read();
	emp2.calSalary();
	emp2.display();	*/
	/*Scanner obj = new Scanner(System.in);
	System.out.println("how many record do you wan to store");
	int n = obj.nextInt();
	Employee emp[]=new Employee[n];
	System.out.println("Enter the records one by one");
	for(int i=0;i<n;i++){
		emp[i]=new Employee();
		emp[i].read();
		emp[i].calSalary();	
	}
	System.out.println("Number of records are ");
	for(int i=0;i<n;i++) {
		emp[i].display();
	}*/	
	}
}
