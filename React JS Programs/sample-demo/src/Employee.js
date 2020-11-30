import React from 'react'
import logo from './logo.svg';
import MyImg from './gmail.png'

let Image = (props)=> <img src={props.name} width="100" height="100"/>

class Employee extends React.Component{
    constructor(props) {
        super(props);
        this.state = {id:0,name:"",salary:0};
        this.storeEmployee = this.storeEmployee.bind(this);
    }
    storeEmployee() {

    }
    render() {



        return(
        <div>
        <h2>Employee Component</h2>
        <img src= {logo} width="100" height="100"/><br/>
        <Image name={MyImg}></Image>
        <input type="button" value="Store Employee" onClick={this.storeEmployee}/>
        </div>
        )
    }
}

export default Employee;