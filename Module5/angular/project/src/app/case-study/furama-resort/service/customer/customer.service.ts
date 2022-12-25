import {Injectable} from '@angular/core';
import {Customer} from "../../model/customer";
import {filter} from "rxjs/operators";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  URL = "http://localhost:3000/customer";

  private customer: Customer[] = [];

  constructor(private clientHttp: HttpClient) {

  }

  findAll(): Observable<any> {
    return this.clientHttp.get(this.URL);
  }

  findById(id: number | null) {
    return this.clientHttp.get(this.URL + "/" + id);
  }


  save(value: Customer): Observable<Customer> {
    return this.clientHttp.post<Customer>(this.URL + "/", value);
  }


// gui kem id va obj
  saveEdit(value: Customer): Observable<Customer> {
    return this.clientHttp.put(this.URL + "/" + value.id, value);
  }

  deleteById(id: number): Observable<Customer> {
    return this.clientHttp.delete(this.URL + "/" + id);
  }

}
