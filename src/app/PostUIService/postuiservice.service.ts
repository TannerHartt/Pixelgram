import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { stringify } from '@angular/compiler/src/util';
import { Observable } from 'rxjs';
//import { PageOfItems } from '../models/pageofitems';
//import { Post } from '../models/post'
import { Post } from 'src/models/post';


@Injectable({
  providedIn: 'root'
})
export class PostuiserviceService {
  /**HTTPClient injection 
   * http://localhost:8080 or whatever the post controller url is
   * Ergin
   *  whenever they get the REST controller if there is a url for the GET, POST, UPDATE, DELETE just add
   *  the url as private baseURL = "URL of the method" and thats it and we can work on the functions
   *  together.
  */
  private baseURL = "http://35.202.176.28/"

  constructor(private http: HttpClient) { }

  fetchListOfPosts():Observable<any> {
    return this.http.get<any>(this.baseURL);
  }

  fetchPagedPosts(pageNumber: number, pageSize: number):Observable<any> {
    const params = `?pageNumber=${pageNumber}&pageSize=${pageSize}`

    return this.http.get<any>(this.baseURL + params);
  } 
}
