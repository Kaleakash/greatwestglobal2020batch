import React from 'react'
class Child1 extends React.Component{
    constructor(props){
        super(props);
        this.state = {childName:"Ajay Kumar"}
       // this.props.child1ToParent("This message from child1");
       this.props.child1ToParent(this.state.childName);
    }


    render() {


        return(
            <div>
                <h2>This is child component</h2>
                <p>{this.props.msg1}</p>
                <p>{this.props.fname}</p>
            </div>
        )
    }
}

export default Child1;