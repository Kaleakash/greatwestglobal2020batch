import React from 'react'
class Login extends React.Component {
constructor(props){
    super(props);
    this.state = {user:"",pass:"",result:"",adminUser:"admin",adminPass:"admin"}
    this.verifyUser=this.verifyUser.bind(this); //normal function we have register 
}

verifyUser(event) {
    event.preventDefault();     //disable action features of form submit button
   if(this.state.user===this.state.adminUser && this.state.pass===this.state.adminPass){
        console.log("Successfully Login")
        this.setState({result:"Successfully Login!"})
    }else {
        //console.log("Failure try once again!")
        this.setState({result:"Failure try once again!"})
    }
}
changeValue=(event) => {
let inputName = event.target.name;
let inputValue = event.target.value;
this.setState({[inputName]:inputValue}) //set value for more state with common function
}
fun = n1=>event=> {
    console.log(n1)
}
    render() {
        return(
            <div>
                {this.state.result}
                <h2>Login Page</h2>
                <form onSubmit={this.verifyUser}>
                 <label>UserName</label>
                 <input type="text" name="user" onChange={this.changeValue}/><br/>
                 <label>Password</label>
                 <input type="password" name="pass" onChange={this.changeValue}/><br/>
                 <input type="submit" value="submit"/>
                 <input type="reset" value="reset"/>   
                 <input type="button" value="click" onClick={this.fun(10)}/>
                </form>
            </div>
        )
    }
}

export default Login;