import logo from './logo.svg';
import './App.css';
import React from 'react';
class App extends React.Component {
  constructor(props){
    super(props);
    this.state ={name:"Ravi"};
    console.log("constructor called...")
  }

  static get defaultProps() {
    console.log("default props intialization");
  }
  componentWillMount(){         // intialization for your state. before render 
    console.log("component will mount method")
    this.setState({name:"Ramesh"});
  }
  componentDidMount() {           // after view 
    console.log("component did mounth");
  }

  componentWillUpdate() {       //before update 
    console.log("will update ")
  }
  fun = ()=> {
    let nameValue = this.refs.n1.value;
    this.setState({name:nameValue});  // updating the state 
   // console.log("Name is "+name)      
  }
  componentDidUpdate() {          //after update 
    console.log('did update');
  }
  componentWillUnmount() {        // before destory 
    console.log("after destroy the component")
  }
    render() {                          //view on html page 
      console.log("Render method called...");
      return(
        
        <div>
          <h1>React Life method</h1>
          Name is {this.state.name}<br/>
          <input type="text" ref="n1"/><br/>    
        <input type="button" value="Change the Name " onClick={this.fun}/>  
        </div>
        
      )
    }
}

export default App;
