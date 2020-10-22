alert("Welcome to External JavaScript file");
var name = prompt("Please enter the name");
alert("Welcome user "+name);
var a = prompt("Enter the valule of a");
var b = prompt("Enter the value of b");
var sum = eval(a)+eval(b);
alert("Sum is "+sum);
var c = eval(prompt("Enter the value c"))
alert(c+200);
var result = confirm("Do you want to continue?")
if(result){
    alert("You can processed")
}else {
    alert("You can't ");
}