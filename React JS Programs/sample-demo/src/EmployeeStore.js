import React from 'react'
import axios from 'axios';

class EmployeeStore extends React.Component{
    constructor(props){
        super(props);
        this.state={empId:0,name:"",salary:0.0,msg:""}
    }
    storeEmployee  = (event)=> {
        event.preventDefault();
      //console.log(this.state);
      let emp = this.state;
      axios.post("http://localhost:9090/storeEmployee",emp).
      then(result=>this.setState({msg:result.data})).catch(error=>console.log(error));
    }
    changeValue=(event)=> {
        let name = event.target.name;
        let value = event.target.value;
        this.setState({[name]:value});
    }
    render() {

     return(
            <div>
                {this.state.msg}
            <h2>Employee Store in Spring boot</h2>
            <form onSubmit={this.storeEmployee}>
                <label>Employee Id </label>
                <input type="text" name="empId" onChange={this.changeValue}/><br/>
                <label>Employee Name </label>
                <input type="text" name="name" onChange={this.changeValue}/><br/>
                <label>Employee Salary </label>
                <input type="text" name="salary" onChange={this.changeValue}/><br/>
                <input type="submit" value="submit"/>
                <input type ="reset" value="rest"/>
            </form>

                       </div>
        )
    }
}

export default EmployeeStore;