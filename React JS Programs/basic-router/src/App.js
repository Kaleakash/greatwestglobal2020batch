import {Link,Route,Switch} from 'react-router-dom'

import {withRouter} from 'react-router-dom'
import React from 'react';
import Login from './Login'

let AboutUs = ()=><h1>About Us Component</h1>
let ContactUs = ()=><h1>Contact Us Component</h1>
let Dashboard = ()=>{

  let user = sessionStorage.getItem("obj");

  return <h1>Welcome user {user}</h1>
}


class App extends React.Component {
  constructor(props){
    super(props);

  }

  render() {

    return(

      <div>
        <h2>This is Routing Example</h2>
     
          <div>
            <ul>
              <li>
                <Link to="/login">Login</Link>    
              </li>
              <li>
                <Link to="/contactus">ContactUs</Link>
              </li>
              <li>
                <Link to="/aboutus">AboutUs</Link>
              </li>
            </ul>
          </div>

          <hr/>

          <Switch>
            <Route path="/login" component={Login}></Route>
            <Route path="/contactus" component={ContactUs}></Route>
            <Route path="/aboutus" component={AboutUs}></Route>
            <Route path="/dashboard" component={Dashboard}></Route>

          </Switch>
                     
      </div>
    )
  }
}

export default withRouter(App);
