import React from 'react'


class Employees {
    constructor(id,name,salary){
      this.id = id;
      this.name = name;
      this.salary = salary;
    }
    storeEmployee() {

    }
}

class EmployeeDetail extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        let num=[10,20,30,40,50]
        let employees = [];
        let emp1 = new Employees(1,"Ravi",12000);
        let emp2 = new Employees(2,"Ramesh",14000);
        let emp3 = new Employees(3,"Rajesh",16000); 
          employees.push(emp1);
          employees.push(emp2);
          employees.push(emp3);

    let EmpData = employees.map(e=><li key={e.id}>Id is {e.id}, Name is {e.name}, Salary is {e.salary}</li>)   
    let numDetails = num.map(v=><h1 key={v}>{v+100}</h1>) 
    let EmpRow = employees.map(e=><tr key={e.id}><td>{e.id}</td><td>{e.name}</td><td>{e.salary}</td></tr>)    
        return(

            <div>
                <h2>All Employee Details are </h2>
                <ul>
                    {EmpData}
                </ul>
                <br/>
                {numDetails}
                <br/>
                <h2>Employee Records in Table format</h2>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Salary</th>
                        </tr>
                    </thead>
                    <tbody>
                        {EmpRow}
                    </tbody>
                </table>
            </div>
        )
    }
}

export default EmployeeDetail;