/*
object is a any real world entity. 
properites (state) - fields / variables. 
behaviour --- function 
In JavaScript function itself behave like a class 
*/
/*
function Employee() {   
    //property 
    this.id = 100;
    this.name = "Ravi";
    this.age = 21;
    //behaviour 
    this.display = function() {
        document.write("<br/>")
       document.write("id is "+this.id);
       document.write("name is "+this.name);
       document.write("salary is "+this.age); 
    }
}

var emp1 = new Employee();   // created memory of employee object 
document.write("id is "+emp1.id+"<br/>")
document.write("name is "+emp1.name+"<br/>")
document.write("age is "+emp1.age+"<br/>")

var emp2 = new Employee();   // created memory of employee object 
document.write("id is "+emp2.id+"<br/>")
document.write("name is "+emp2.name+"<br/>")
document.write("age is "+emp2.age+"<br/>")
//emp.display();
*/

function Employee(id,name,age) {   
    //property 
    this.id = id;
    this.name = name;
    this.age = age;
    //behaviour 
    this.display = function() {
        document.write("<br/>")
       document.write("id is "+this.id);
       document.write("name is "+this.name);
       document.write("salary is "+this.age); 
    }
}
var emp1 = new Employee(101,"Ramesh",34);   // created memory of employee object 
document.write("id is "+emp1.id+"<br/>")
document.write("name is "+emp1.name+"<br/>")
document.write("age is "+emp1.age+"<br/>")
var emp2 = new Employee(101,"Seeta",21);   // created memory of employee object 
document.write("id is "+emp2.id+"<br/>")
document.write("name is "+emp2.name+"<br/>")
document.write("age is "+emp2.age+"<br/>")
