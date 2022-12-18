import {Component, Input, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../../../model/customer";
import {CustomerService} from "../../../service/customer/customer.service";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  editCustomerForm: FormGroup;

  constructor(private _customerService:CustomerService) {


  }

  ngOnInit(): void {
    this.editCustomerForm = new FormGroup({
      id: new FormControl('',[Validators.required]),
      name: new FormControl('',[Validators.required]),
      dateOfBirth: new FormControl('',[Validators.required]),
      email: new FormControl('',[Validators.email,Validators.required]),
      age: new FormControl('',[Validators.required,Validators.min(18)]),
      address: new FormControl('',[Validators.required]),
      gender: new FormControl('',[Validators.required]),
      phone: new FormControl('',[Validators.required, Validators.pattern("^\\+84\\d{9,10}$")])
    })
  }

  submitFormEdit() {


  }
}
