class Customer {
	constructor(id=0,name="Unknown") {	
		this.id=id;
		this.name = name;
		console.log("Object created");
	}
	/*constructor(id){
		this.id = id;
	}*/
	display() {
		console.log("This is display function of Customer class");
		console.log("id is "+this.id);
		console.log("name is "+this.name);
	}
}
let cust1 = new Customer(1,"Ravi");
cust1.display();
let cust2 = new Customer(2,"Ramesh");
cust2.display();
let cust3 = new Customer(3);
cust3.display();

let cust4 = new Customer();
cust4.display();
