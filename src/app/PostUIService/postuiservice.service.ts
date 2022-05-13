import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

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
  private baseURL = ""

  constructor(private http: HttpClient) { }

  /**
   * When they get the controller up we need to match each function to the function in the controller
  */
}
