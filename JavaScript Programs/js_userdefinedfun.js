function disInfo() {
    document.write("User defined function<br/>")
}
disInfo();
function empInfo(id,name,salary){
document.write("id is "+id+" Name is "+name+" Salary is "+salary+"<br>");
document.write(`id is ${id} name is ${name} salary is ${salary}<br/>` );
}
empInfo(1,"Ravi",12000);
empInfo(2,"Ramesh");
function addNumber(a,b){
    var sum = a+b;
    return sum;
}
var result = addNumber(100,200);
document.write("Sum is "+result+"<br/>");
document.write(addNumber(1,2));
function sayHello() {
    return "Welcome to JavaScript";
}
document.write("<br/>")
document.write(sayHello())