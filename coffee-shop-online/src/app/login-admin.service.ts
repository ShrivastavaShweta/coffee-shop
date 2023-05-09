import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Admin } from './admin';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginAdminService {

  private baseUrl = "http://localhost:8080/admin-login"

  constructor(private httpClient:HttpClient) { }

  loginAdmin (admin : Admin): Observable<object>{

    return this.httpClient.post(`${this.baseUrl}`, admin);
  }
}
