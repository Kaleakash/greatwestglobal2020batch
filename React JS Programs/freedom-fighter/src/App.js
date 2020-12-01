import React from 'react';
import FreedomFighter from './FreedomFighter'
class App extends React.Component {
  constructor(props){
    super(props);
  }

  render() {


    return(
      <div>
        <h1>Main Component</h1>
        <FreedomFighter></FreedomFighter>
      </div>
    )
  }
}

export default App;
