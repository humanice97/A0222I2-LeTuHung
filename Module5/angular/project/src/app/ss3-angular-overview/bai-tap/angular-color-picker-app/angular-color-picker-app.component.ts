import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-angular-color-picker-app',
  templateUrl: './angular-color-picker-app.component.html',
  styleUrls: ['./angular-color-picker-app.component.css']
})
export class AngularColorPickerAppComponent implements OnInit {

  color: string ;
  style:string;
  clickChange(){
    switch (this.color) {
      case "red":
        this.style = "width: 500px; height: 500px; background-color: red;"
        break;
        case "green":
        this.style = "width: 500px; height: 500px; background-color: green;"
        break;
        case "blue":
        this.style = "width: 500px; height: 500px; background-color: blue;"
        break;
    }
  
  }

  constructor() { }

  ngOnInit(): void {
  }

 

 

}


