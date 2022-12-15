import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";
import {validate} from "codelyzer/walkerFactory/walkerFn";

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  registerForm: FormGroup;

  constructor() {

    this.registerForm = new FormGroup({
      email: new FormControl("", [Validators.required, Validators.email]),
      pwGroup: new FormGroup({
        password: new FormControl("", [Validators.required, Validators.minLength(6)]),
        confirmPassword: new FormControl("", [Validators.required, Validators.minLength(6)]),
      }, c => this.checkPassword(c)),
      country: new FormControl("", [Validators.required]),
      age: new FormControl("", [Validators.required, Validators.min(18)]),
      gender: new FormControl("", [Validators.required]),
      phone: new FormControl("", [Validators.required, Validators.pattern("^\\+84\\d{9,10}$")]),
    });
  }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.registerForm)
  }

  checkPassword(c: AbstractControl) {
    const v = c.value;
    return (v.password === v.confirmPassword) ? null : {
      passNotMatch: true
    }
  }
}
