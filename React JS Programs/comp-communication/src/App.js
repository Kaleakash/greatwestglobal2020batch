import React from 'react'
import Child1 from './Child1';

class App extends React.Component{
  constructor(props){
    super(props);
    this.state = {name:"Ravi Kumar",childValue:""};
  }

  callBackChild1=(data)=> {
   // console.log(data);
    this.setState({childValue:data});
  }
  render() {


    return(
      <div>
      <h1>Component Communiciation</h1>
      <p>Parent Component Area</p>
      <hr/>
      <Child1 msg1="This is message from parent" fname={this.state.name}
      child1ToParent={this.callBackChild1}></Child1>
      <hr/>
      Name from child component is {this.state.childValue}
      </div>
    )
  }
}

export default App;
