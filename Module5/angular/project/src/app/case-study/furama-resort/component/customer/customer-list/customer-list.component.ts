import {Component, EventEmitter, OnChanges, OnInit, Output, SimpleChanges} from '@angular/core';
import {Customer} from "../../../model/customer";
import {CustomerService} from "../../../service/customer/customer.service";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {


  customer: Customer = {};
  customerList: Customer[] = [];

  constructor(private _customerService: CustomerService) {

  }

  ngOnInit(): void {
    this._customerService.findAll().subscribe((data) => {
      this.customerList = data;
    })
  }


  showModalDel(id: number) {
    this._customerService.findById(id).subscribe(data => {
      this.customer = data;
    });
  }

  delCus(id: number) {
    this._customerService.deleteById(id).subscribe(() => {
    }, error => {
    }, () => {
      this.ngOnInit();
    })
    // this.ngOnInit()
  }
}
