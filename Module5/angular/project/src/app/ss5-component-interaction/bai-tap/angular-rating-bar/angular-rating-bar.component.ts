import {Component, Input, OnInit} from '@angular/core';
import {IRatingUnit} from "../irating-unit";

@Component({
  selector: 'app-angular-rating-bar',
  templateUrl: './angular-rating-bar.component.html',
  styleUrls: ['./angular-rating-bar.component.css']
})
export class AngularRatingBarComponent implements OnInit {

  IRatingUnit: IRatingUnit = {
    value: 3,
    active: 'red'
  }

  constructor() {
  }

  ngOnInit(): void {
  }

  getNumber(val: number) {
    this.IRatingUnit.value = val
  }
}
