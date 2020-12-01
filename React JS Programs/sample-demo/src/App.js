import React from 'react';
import Employee from './Employee';
import Login from './Login'
import EmployeeDetail from './EmployeeDetails'
import EmployeeRetrieve from './EmployeeRetrieve';
import EmployeeRetrieveById from './EmployeeRetrieveById'

import EmployeeStore from './EmployeeStore';

class App extends React.Component{
  constructor(props){
    super(props);

  }
  render() {

    return(
      <div>
        <h1>This is My Web App</h1>
        {/*
        <Employee></Employee>
       
        <Login></Login>
         
         <EmployeeDetail></EmployeeDetail>
      
         <EmployeeRetrieve></EmployeeRetrieve>
            
            <EmployeeRetrieveById></EmployeeRetrieveById>
        */}
        <EmployeeStore></EmployeeStore>
      </div>
    )
  }
}
export default App;
