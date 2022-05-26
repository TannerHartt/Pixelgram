import { ValueConverter } from '@angular/compiler/src/render3/view/template';
import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {
  usernameControl = new FormControl('')
  passwordControl = new FormControl('')

  constructor() { }

  ngOnInit(): void {
  }

  usernameEmpty(): boolean {
    try{
      let user: String = this.usernameControl.value
      return user.trim() == ''
    }
    catch {
      return true;
    }
  }

  passwordEmpty(): boolean {
    try{
      let pass: String = this.passwordControl.value
      return pass.trim() == ''
    }
    catch {
      return true;
    }
  }

}
