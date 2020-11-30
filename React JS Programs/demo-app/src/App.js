import React from 'react';

function Employee(props) {
  return(
    <div>
      This is Employee Component<br/>
      Your id is {props.id} and your age is {props.age} and your name is {props.name}
    </div>
  )
}
let Info = (props)=><div>Welcome to Info Component - {props.msg}</div>

class App extends React.Component{
  constructor(props){
   super(props);       // pass the props to super class Component constructor 
   this.state={id:0,name:""};  // id and name are state variable 
   this.display=this.display.bind(this);  //register user-defined function in component 
  }
  display() {
    console.log("Fun called....");
    this.setState({id:101,name:"Raj Deep"});
  }
  render(){
   //this.display();
    return(
      <div>      
        <Info msg="This is child component"></Info>
      <h1>Welcom to React JS Class Style</h1>
      <hr/>
      
      <hr/>
      <b>Id is {this.state.id} and Name is {this.state.name}</b>
      <br/>
      <input type="button" value="Click Here" onClick={this.display}/>
      <input type="button" value="Change through Arrow"
      onClick={()=>this.setState({id:102,name:"Seeta Kumari"})}/>
      <Employee id="100" age="21" name={this.state.name}></Employee>
      <Employee id="100" age="21" name={this.state.name}></Employee>
      <Employee id="100" age="21" name={this.state.name}></Employee>
      <Info msg="This my another component"></Info>
    </div>)
  }
}
export default App;

/*function Header() {
  return(
    <div>
      This is Header Component
    </div>
  )
}

let Footer = ()=><div>This is Footer Component</div>

function App() {  
  return (
    <div>
      <Header></Header>
      <h1>Welcome to React JS</h1>
      <h1>Welcome to React JS</h1>
      <Footer></Footer>
     </div>
  );
}

export default App;
*/
