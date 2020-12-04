import { Component } from '@angular/core';

@Component({          //decorator 
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-demo';
  name:string="Raj Deep";
  age:number =21;
}

/*
<div>
  <h1>Welcome to Angular Framework</h1>
  Name {{name}}, Age is {{age}}
</div>

*/
