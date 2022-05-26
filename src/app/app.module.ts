import { HttpClientModule, HttpClient } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { PostComponent } from './post/post.component';
import { UserComponent } from './user/user.component';
<<<<<<< HEAD
import { CommentComponent } from './comment/comment.component';
=======
import { LandingPageComponent } from './landing-page/landing-page.component';
import { FeedComponent } from './feed/feed.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { InfiniteScrollModule } from 'ngx-infinite-scroll';
>>>>>>> develop

@NgModule({
 imports: [
    BrowserModule,
    HttpClientModule,
    InfiniteScrollModule
  ],
  declarations: [
    AppComponent,
    PostComponent,
    UserComponent,
<<<<<<< HEAD
    CommentComponent
=======
    NavBarComponent,
    FeedComponent,
    LandingPageComponent,
    NavBarComponent
>>>>>>> develop
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
