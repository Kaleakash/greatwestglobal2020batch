function onOver(ele) {
var val = ele.alt
document.getElementById("info").innerHTML=val
document.getElementById(ele.id).width=100
document.getElementById(ele.id).height=100
//document.getElementById("a1").style.cssPropertyName=value;
}

function onOut(ele) {
document.getElementById("info").innerHTML=""
document.getElementById(ele.id).width=50
document.getElementById(ele.id).height=50 
}