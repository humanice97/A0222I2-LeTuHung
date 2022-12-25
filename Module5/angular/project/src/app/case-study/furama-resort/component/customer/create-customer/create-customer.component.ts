import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Customer} from "../../../model/customer";
import {ActivatedRoute, Router} from "@angular/router";
import {CustomerService} from "../../../service/customer/customer.service";
import {$} from "protractor";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  createCustomerForm: FormGroup;

  constructor(private activeRoute: ActivatedRoute,private customerService: CustomerService, private router: Router) {
    this.createCustomerForm = new FormGroup({
      // id: new FormControl('',[Validators.required]),
      name: new FormControl('',[Validators.required]),
      dateOfBirth: new FormControl('',[Validators.required]),
      email: new FormControl('',[Validators.email,Validators.required]),
      age: new FormControl('',[Validators.required,Validators.min(18)]),
      address: new FormControl('',[Validators.required]),
      gender: new FormControl('',[Validators.required]),
      phone: new FormControl('',[Validators.required, Validators.pattern("^\\+84\\d{9,10}$")])
    })
  }

  ngOnInit(): void {

  }

  submitForm() {
    console.log(this.createCustomerForm);
    if(this.createCustomerForm.status == "VALID"){
      this.customerService.save(this.createCustomerForm.value).subscribe(() =>{
        this.createCustomerForm.reset();
      },() => {
        console.log('err')
      },() => {
        this.router.navigateByUrl("customer")
      });
    }else {

    }

    // document.getElementById('modelId').click();
    // @ts-ignore
    // window.location = 'http://localhost:4200/customer'
    // this.createCustomerForm.reset();
  }
}
