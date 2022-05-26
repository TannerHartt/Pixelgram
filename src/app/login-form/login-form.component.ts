import { Component, OnInit } from '@angular/core';
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
  
  doc = document.getElementById('userN')?.addEventListener('click', (clickEvent: MouseEvent) => {
    console.log('click event happening!', clickEvent);
  });
}
