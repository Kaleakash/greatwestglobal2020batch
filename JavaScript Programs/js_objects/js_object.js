var str = new String("Welcome to JavaScript");
/*window.document.write(str);
window.alert("Welcome")
document.write(str)
alert("welcome")
*/
document.write("string object <br/>")
document.write(str+"<br/>");
document.write(str.toLowerCase()+"<br/>")
document.write(str.toUpperCase()+"<br/>")
document.write(str.substring(3)+"<br/>")
document.write(str.substring(5,15)+"<br/>")
document.write(str.indexOf('e')+"<br/>")
/*var arr = new Array();
arr.push(10);
arr.push(20);
arr.push(30);
document.write("Array Object <br/>")
document.write(arr+"<br/>")
document.write(arr.pop()+"<br/>")
document.write(arr+"<br/>")*/
var arr = new Array(10,20,30);
document.write("Array Size is "+arr.length+"<br>")
document.write(arr[0]+"<br>")
var dd = new Date();
document.write("Date Object <br/>")
document.write(dd.getDate()+"<br/>")
dd.setMonth(dd.getMonth()+1);
document.write(dd.getMonth()+"<br/>")
document.write(dd.getYear()+"<br/>")
document.write(dd.getFullYear()+"<br/>")
document.write("Math Object <br/>")
document.write(Math.PI+"<br>")
document.write(Math.sqrt(4)+"<br/>")
