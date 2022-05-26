import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthResponse } from 'src/models/auth-response';
import { AuthReq } from 'src/models/auth-req';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
  private baseURL = "http://34.72.139.183/auth/token";
  
  constructor(private http: HttpClient) { }

  userLogin(authreq: AuthReq):Observable<AuthResponse> {
    return this.http.get<AuthResponse>(`${this.baseURL}?username=${authreq.username}&password=${authreq.password}&client_id=${authreq.client_id}&grant_type=${authreq.grant_type}`);
  }
}
