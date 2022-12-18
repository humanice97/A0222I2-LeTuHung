import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-angular-color-picker-app',
  templateUrl: './angular-color-picker-app.component.html',
  styleUrls: ['./angular-color-picker-app.component.css']
})
export class AngularColorPickerAppComponent implements OnInit {

  color: string;
  style: string;


  constructor() {
  }

  ngOnInit(): void {

  }


  getColor($event: any) {
    this.color = $event
    this.style = `width: 500px; height: 500px; background-color: ${this.color}`
  }
}


