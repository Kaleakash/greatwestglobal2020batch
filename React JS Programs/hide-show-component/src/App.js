import React from 'react';
import Dashboard from './Dashboard';
let AboutUs = ()=><h2>About Us Component</h2>
let ContactUs = ()=><h2>Contact Us Component</h2>
let Login = (props)=><h2>Login Component {props.name}</h2>
//let Dashboard = ()=><h2>Dashboard Component</h2>

class App extends React.Component {
  constructor(props){
    super(props);
    this.state = {f1:false,f2:false,f3:false,f4:false,
      b1:"Show",b2:"Show",b3:"Show",b4:"Show"};
  }

  render() {
    return(
      <div>
        <h2>This Show Hide Component</h2>
        
        {this.state.f1 && <AboutUs></AboutUs>}
        {this.state.f2 && <ContactUs></ContactUs>}
        {this.state.f3 && <Login></Login>}
        {this.state.f4 && <Dashboard></Dashboard>}

        <input type="button" value={this.state.b1} onClick={()=>{
                if(!this.state.f1){
                  this.setState({f1:true,b1:"Hide"});
                }else {
                  this.setState({f1:false,b1:"Show"});
                }
        }}/>
        <input type="button" value={this.state.b2} onClick={()=>{
                if(!this.state.f2){
                  this.setState({f2:true,b2:"Hide"});
                }else {
                  this.setState({f2:false,b2:"Show"});
                }
        }}/>
        <input type="button" value={this.state.b3} onClick={()=>{
                if(!this.state.f3){
                  this.setState({f3:true,b3:"Hide"});
                }else {
                  this.setState({f3:false,b3:"Show"});
                }
        }}/>
        <input type="button" value={this.state.b4} onClick={()=>{
                if(!this.state.f4){
                  this.setState({f4:true,b4:"Hide"});
                }else {
                  this.setState({f4:false,b4:"Show"});
                }
        }}/>
      </div>
    ) 
  }
}

export default App;
