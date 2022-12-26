import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Customer} from "../../model/customer";
import {HttpClient} from "@angular/common/http";
import {Facilities} from "../../model/facilities";

@Injectable({
  providedIn: 'root'
})
export class FacilitiesService {
  URL = "http://localhost:3000/facilities";

  constructor(private clientHttp: HttpClient) {

  }
  findAll(): Observable<any> {
    return this.clientHttp.get(this.URL);
  }

  findById(id: number | null) {
    return this.clientHttp.get(this.URL + "/" + id);
  }


  save(value: Facilities): Observable<Facilities> {
    return this.clientHttp.post<Facilities>(this.URL + "/", value);
  }


// gui kem id va obj
  saveEdit(value: Facilities): Observable<Facilities> {
    return this.clientHttp.put(this.URL + "/" + value.id, value);
  }

  deleteById(id: number): Observable<Facilities> {
    return this.clientHttp.delete(this.URL + "/" + id);
  }
}
