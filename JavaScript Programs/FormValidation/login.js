function validate() {
    //alert("fun called....")
    var uname = document.getElementById("uname").value;
    var pname = document.getElementById("pname").value
    if(uname.length==0){
        //alert("Plese enter the username")
document.getElementById("e1").innerHTML="User Name is required"
document.getElementById("e2").innerHTML=""
        return false;
    }else if(pname.length==0) {
      //  alert("Please enter the password")
      document.getElementById("e2").innerHTML="Password is required"  
      document.getElementById("e1").innerHTML=""    
        return false;
    }else if(uname=="Ajay" && pname=="Kumar"){
        alert("Successfully Login!")
        return true;
    }else {
        alert("Failure try once again")
        return false;
    }
  
}