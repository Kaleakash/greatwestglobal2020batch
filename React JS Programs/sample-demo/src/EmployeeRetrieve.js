import React from 'react'
import axios from 'axios';

class EmployeeRetrieve extends React.Component{
    constructor(props){
        super(props);
        this.state={employees:[]}
    }
    loadEmployeeRecords  = ()=> {
       // axios.get("http://localhost:9090/allEmployees").
       // then(result=>console.log(result.data)).catch(error=>console.log(error));
       axios.get("http://localhost:9090/allEmployees").
       then(result=>this.setState({employees:result.data})).catch(error=>console.log(error));
    }
    render() {

 let EmpRec = this.state.employees.map(e=><tr key={e.empId}><td>{e.empId}</td><td>{e.name}</td><td>{e.salary}</td></tr>)       

        return(
            <div>
                <h2>Employee Retrieve From Spring Boot</h2>
                <input type="button" value="LoadData" onClick={this.loadEmployeeRecords}/>
                <hr/>
                <table>
                    <thead>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Salary</th>
                    </thead>
                    <tbody>
                        {EmpRec}
                    </tbody>
                </table>
            </div>
        )
    }
}

export default EmployeeRetrieve;