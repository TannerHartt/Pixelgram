import { Component, HostListener, OnInit } from '@angular/core';
import { EventManager } from '@angular/platform-browser';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  isEmpty: boolean = true;
  checkInputStatus(): boolean {
    
    if ( document.getElementById('userN')?.innerText == "") {
      console.log("Empty")
     return true; 
    }
    if ( document.getElementById('userN')?.innerText !== "") {
      console.log("Not empty")
      return true;
    }
    return false;
  }




}
