import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-count-down',
  templateUrl: './count-down.component.html',
  styleUrls: ['./count-down.component.css']
})
export class CountDownComponent implements OnInit {
  time = 10;
  myInterval;

  constructor() {
  }

  ngOnInit(): void {
  }

  start() {
    this.myInterval = setInterval(() => {
      this.time--;
      if(this.time == 0){
        this.finish()
        alert("Happy new year!!")
      }
    }, 1000)

  }

  reset() {
    this.time = 10;
  }

  finish() {
    clearInterval(this.myInterval)
  }

}
