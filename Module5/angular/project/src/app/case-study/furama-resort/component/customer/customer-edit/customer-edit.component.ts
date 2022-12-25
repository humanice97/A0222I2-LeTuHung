import {Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../../../model/customer";
import {CustomerService} from "../../../service/customer/customer.service";
import {ActivatedRoute, Route, Router} from "@angular/router";
import {DatePipe} from "@angular/common";
import * as moment from "moment";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css'],
})
export class CustomerEditComponent implements OnInit, OnChanges {
  editCustomerForm: FormGroup;
  customer: Customer = {};


  constructor(private _customerService: CustomerService,
              private activeRoute: ActivatedRoute,
              private datePipe: DatePipe,
              private router: Router) {
  }


  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe(data => {
      const id = parseInt(data.get("id"));
      this._customerService.findById(id).subscribe(data => {
        this.customer = data;
      }, error => {
        console.log('error')
      }, () => {
        this.showEditForm()
      });
    });
  };

  showEditForm() {
    this.editCustomerForm = new FormGroup({
      id: new FormControl(this.customer.id, [Validators.required]),
      name: new FormControl(this.customer.name, [Validators.required]),
      dateOfBirth: new FormControl(moment(this.customer.dateOfBirth).format('YYYY-MM-DD'), [Validators.required]),
      // dateOfBirth: new FormControl(this.datePipe.transform(this.customer.dateOfBirth, 'yyyy-dd-MM'), [Validators.required]),
      email: new FormControl(this.customer.email, [Validators.email, Validators.required]),
      age: new FormControl(this.customer.age, [Validators.required, Validators.min(18)]),
      address: new FormControl(this.customer.address, [Validators.required]),
      gender: new FormControl(this.customer.gender, [Validators.required]),
      phone: new FormControl(this.customer.phone, [Validators.required, Validators.pattern("^\\+84\\d{9,10}$")])
    });
  }

  submitFormEdit() {
    this._customerService.saveEdit(this.editCustomerForm.value).subscribe(() =>{
      this.router.navigateByUrl('customer')
    },error => {
      console.log("error")
    });

  }

  ngOnChanges(changes: SimpleChanges): void {

  }
}
