import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { PostComponent } from '../components/post/post.component';
import { UserComponent } from '../components/user/user.component';
import { LandingPageComponent } from '../components/landing-page/landing-page.component';
import { FeedComponent } from 'src/components/feed/feed.component';
=======
import { PostComponent } from './post/post.component';
import { UserComponent } from './user/user.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
>>>>>>> 8d58458baf3437e4ad24c8fbc956717432d294dd

@NgModule({
 imports: [
    BrowserModule,
    HttpClientModule
  ],
  declarations: [
    AppComponent,
    PostComponent,
    UserComponent,
<<<<<<< HEAD
    LandingPageComponent,
    FeedComponent
=======
    NavBarComponent
>>>>>>> 8d58458baf3437e4ad24c8fbc956717432d294dd
  ],
  providers: [HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
