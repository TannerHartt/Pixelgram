import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  constructor() { }
  
  ngOnInit(): void {
  }

  Login: boolean = true;
  isVisible: boolean = false;


  goTo(url: any) {
    window.location.href = url;
  }

  refreshPage() {
    window.location.reload();
  }

  showLogin() {
    this.Login = !this.Login;
    this.isVisible = !this.isVisible;
  }
}
