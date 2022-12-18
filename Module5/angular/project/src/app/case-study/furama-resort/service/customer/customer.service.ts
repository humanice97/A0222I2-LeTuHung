import {Injectable} from '@angular/core';
import {Customer} from "../../model/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private _customer: Customer[] = [
    {
      id: 1,
      name: 'Hung',
      age: 18,
      address: 'Quang Nam',
      dateOfBirth: new Date('1999-2-2'),
      email: 'humanice97@gmail.com',
      gender: true,
      phone: '0782076264'
    },
    {
      id: 2,
      name: 'Hai',
      age: 22,
      address: 'Quang Nam',
      dateOfBirth: new Date('1999-2-2'),
      email: 'hai@gmail.com',
      gender: true,
      phone: '01230124014'
    },
    {
      id: 3,
      name: 'Trung',
      age: 25,
      address: 'Da Nang',
      dateOfBirth: new Date('1999-2-2'),
      email: 'trung@gmail.com',
      gender: true,
      phone: '012421823123'
    },
    {
      id: 4,
      name: 'Tuan',
      age: 28,
      address: 'Da Nang',
      dateOfBirth: new Date('1999-2-2'),
      email: 'tuan@gmail.com',
      gender: true,
      phone: '012481231923'
    },
    {
      id: 5,
      name: 'Vuong',
      age: 19,
      address: 'Gia Lai',
      dateOfBirth: new Date('1999-2-2'),
      email: 'vuong@gmail.com',
      gender: true,
      phone: '012412831231'
    }]

  constructor() {
  }

  findAll(){
    return this._customer;
  }
}
