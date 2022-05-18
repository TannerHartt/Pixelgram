import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class PostServiceService {
  private baseURL = "http://35.202.176.28/posts"

  constructor(private http: HttpClient) { }

  fetchListOfPosts():Observable<any> {
    return this.http.get<any>(this.baseURL);
  }

  fetchPagedPosts(pageNumber: number, pageSize: number):Observable<any> {
    const params = `?pageNumber=${pageNumber}&pageSize=${pageSize}`

    return this.http.get<any>(this.baseURL + params);
  } 
}
