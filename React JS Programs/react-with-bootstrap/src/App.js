import React from 'react';

import 'bootstrap/dist/css/bootstrap.min.css'

class App extends React.Component {
  constructor(props){
    super(props);
  }

  render() {

    return(
      <div>
        <input type="button" type="Click Here" className="btn btn-success" value="Click Here"/>
        <input type="button" type="Click Here" className="btn btn-secondary" value="Click Here"/>
        <input type="button" type="Click Here" className="btn btn-danger" value="Click Here"/>
        <input type="button" type="Click Here" className="btn btn-warning" value="Click Here"/>
        <input type="button" type="Click Here" className="btn btn-dark" value="Click Here"/>
        
      </div>
    )
  }
}

export default App;
