import React from 'react'


class Login extends React.Component{
    constructor(props){
        super(props);
        this.state ={user:"admin",pass:"admin",msg:""}
    }
    verifyUser=(event)=>{
        event.preventDefault();
                if(this.state.user=="admin" && this.state.pass==="admin"){
                        sessionStorage.setItem("obj",this.state.user); //from DB 
                        //string, number, arrayObject or json object. 
                        this.props.history.push("/dashboard")
                }else {
                        this.setState({msg:"InValid userName or Password"});
                }
    }
    changeValue=(event)=> {
       // console.log(event.target.name+" "+event.target.value)
        this.setState({[event.target.name]:event.target.value})
    }
    render(){


        return(
            <div>
                <h2>Login Page</h2>    
                <form onSubmit={this.verifyUser}>
                    <label>UserName</label>
                    <input type="text" name="user" onChange={this.changeValue}/><br/>
                    <label>Password</label>
                    <input type="password" name="pass" onChange={this.changeValue}/><br/>
                    <input type="submit" value="submit"/>
                </form>
                {this.state.msg}
            </div>        
            
            )
    }
}

export default Login;