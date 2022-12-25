import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  URL = "http://localhost:3000/product"

  constructor(private httpClient: HttpClient) {

  }

  findAll(): Observable<any> {
    return this.httpClient.get(this.URL);
  }

  save(value: Product): Observable<Product> {
    return this.httpClient.post(this.URL, value)
  }
}
