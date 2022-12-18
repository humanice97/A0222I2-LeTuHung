import {Component, OnInit} from '@angular/core';
import {Customer} from "../../../model/customer";
import {CustomerService} from "../../../service/customer/customer.service";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customerList: Customer[] = [];

  constructor(private _customerService: CustomerService) {

  }

  ngOnInit(): void {
    console.log(this._customerService.findAll())
    this.customerList = this._customerService.findAll();
  }


  showCus(item: Customer) {

  }


}
