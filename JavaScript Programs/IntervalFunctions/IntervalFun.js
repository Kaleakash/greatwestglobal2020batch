var obj;
function abc() {
    //setTimeout("alert('Hi')",5000)
    //setTimeout("info()",5000)
    obj = setInterval("displayInfo()",1000)
    //setInterval("displayDateInfo()",500);
}

function stopBackground(){
    clearInterval(obj);
}

function info() {
    document.getElementById("abc").innerHTML="Welcome to My Web Page";
}
var i=0;
function displayInfo() {
    if(i%2==0){
        document.bgColor="Red";
    }else {
        document.bgColor="Green";
    }
    i++;
}
function displayDateInfo() {
    var dd = new Date();
    document.getElementById("abc").innerHTML=dd
}
//abc();

var ii=0;
function changeImage() {
    ii++;
    if(ii==1){

    }
    if(ii==2){

    }
    if(ii==3){

    }
    if(ii>3){
        ii=1;
    }
}