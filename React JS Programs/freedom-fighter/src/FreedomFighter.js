import React from 'react';
class Freedom {
    constructor(id,name,image){
        this.id = id;
        this.name = name;
        this.image = image;
    }
}
class FreedomFighter extends React.Component {
  constructor(props){
    super(props);
  }

  render() {
   let freedomDetails = []
   let f1 = new Freedom(1,"Bal Gangdhar Tilak","/images/BalGangadharTilak.jpg");
   let f2 = new Freedom(2,"Bhagat Singh","/images/BhagatSingh.jpg");
   let f3 = new Freedom(3,"Chandra Shekar Azad","/images/ChandraShekharAzad.jpg");
   let f4 = new Freedom(4,"Jawaharlal Nehru","/images/JawaharlalNehru.jpg"); 
    freedomDetails.push(f1);
    freedomDetails.push(f2);
    freedomDetails.push(f3);
    freedomDetails.push(f4);
let FreeDom = freedomDetails.map(f=><li key={f.id}><img src={f.image} width="200" height="200"/>Name is {f.name}</li>)
    return(
      <div>
        <ul>
            {FreeDom}
        </ul>
      </div>
    )
  }
}

export default FreedomFighter;
