import { Component, OnInit } from '@angular/core';
import { element } from 'protractor';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  valueFistNum:number;
  valueSecondNum:number;
  operatorCal:string;
  result :number;


  cal(){
    switch (this.operatorCal) {
      case "+":
        this.result = +this.valueFistNum + +this.valueSecondNum;
        break;
        case "-":
          this.result=  this.valueFistNum - this.valueSecondNum;
          break; 
        case "*":
          this.result=    this.valueFistNum * this.valueSecondNum
            break;
        case "/":
          this.result = this.valueFistNum / this.valueSecondNum;
        break;
    }
    return this.result;
  }


  constructor() { }

  ngOnInit(): void {
  }
}





