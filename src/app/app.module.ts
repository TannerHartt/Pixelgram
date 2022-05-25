import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { PostComponent } from './post/post.component';
import { UserComponent } from './user/user.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { FeedComponent } from './feed/feed.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { InfiniteScrollModule } from 'ngx-infinite-scroll';
import { LoginPageComponent } from './login-page/login-page.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', component: LandingPageComponent },
  { path: 'login', component: LoginPageComponent }
];

@NgModule({
 imports: [
    BrowserModule,
    HttpClientModule,
    InfiniteScrollModule,
    RouterModule.forRoot(routes)
  ],
  declarations: [
    AppComponent,
    PostComponent,
    UserComponent,
    NavBarComponent,
    FeedComponent,
    LandingPageComponent,
    NavBarComponent,
    LoginPageComponent,
    LoginComponentComponent
  ],
  providers: [HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule { }