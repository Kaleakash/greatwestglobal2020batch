class Employee {
	int id;
	String name;
	float salary;
	Scanner obj = new Scanner(System.in);
	void read() {
		System.out.println("Enter the id");
		id = obj.nextInt();
		System.out.println("Enter the name");
		name = obj.next();
		System.out.println("Enter the salary");
		salary = obj.nextFloat();
	}
	void calSalary() {
		hra = salary*0.10f;
		da = salary*0.05f;
		pf = salary*0.07f;
		salary = salary +hra +da -pf;
	}
	void display() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}	
}
class CarTest {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	emp1.read();
	emp1.calSalary();
	emp1.display();	
	}
}
