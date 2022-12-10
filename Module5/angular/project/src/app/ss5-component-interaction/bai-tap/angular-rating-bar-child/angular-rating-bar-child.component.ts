import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-angular-rating-bar-child',
  templateUrl: './angular-rating-bar-child.component.html',
  styleUrls: ['./angular-rating-bar-child.component.css']
})
export class AngularRatingBarChildComponent implements OnInit {
  @Output('createRating') onCreate = new EventEmitter<number>()
  num: number;

  constructor() { }

  ngOnInit(): void {
  }

  send(x: number) {
    this.num = x;
    this.onCreate.emit(this.num)
  }
}
