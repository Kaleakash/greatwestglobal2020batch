import React from 'react'
import axios from 'axios';

class EmployeeRetrieveById extends React.Component{
    constructor(props){
        super(props);
        this.state={employee:{empId:0,name:"",salary:0},id:0,msg:""}
    }
    loadEmployeeRecordsById  = (event)=> {
        event.preventDefault();
        let id = this.state.id;
       axios.get("http://localhost:9090/getEmpById/"+id).       //path param 
       then(result=>{
           if(result.data==""){
            console.log("Record not present")
            this.setState({msg:"Record is not present"})
           }else {
            this.setState({msg:""})
            console.log("REcord present")
            console.log(result.data)
           this.setState({employee:result.data})
           }
       }).catch(error=>console.log(error));
    }
    changeValue=(event)=> {
        let name = event.target.name;
        let value = event.target.value;
        this.setState({[name]:value});
    }
    render() {

     return(
            <div>
            <h2>Employee Retrieve by From Spring Boot</h2>
            <form onSubmit={this.loadEmployeeRecordsById}>
                <label>Employee Id </label>
                <input type="text" name="id" onChange={this.changeValue}/><br/>
                <input type="submit" value="submit"/>
                <input type ="reset" value="rest"/>
            </form>
            {this.state.msg}
           {this.state.employee.empId} {this.state.employee.name}{this.state.employee.salary}
                       </div>
        )
    }
}

export default EmployeeRetrieveById;