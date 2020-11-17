package bean;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

@Override
public int compareTo(Employee arg0) {
	// TODO Auto-generated method stub
	//Logic 
	System.out.println(" "+this.salary+" "+arg0.salary);
								// both object equal 0, first object is > second object 
								//+ve, second object is > first object 
								//-ve 
	
	//return 0;
	//return this.id-arg0.id;		//Sort Asc by Id		//0, +ve, -ve 
	//return arg0.id-this.id;		//Sort Desc by Id
	//return this.name.compareTo(arg0.name);			//Sort Name Asc
	//return arg0.name.compareTo(this.name);				//sort name desc
	//return (int)(this.salary-arg0.salary);					//Sort salary asc 
	return (int)(arg0.salary-this.salary);				//sort salary desc
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
