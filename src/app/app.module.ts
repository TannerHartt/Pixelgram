import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PostComponent } from '../components/post/post.component';
import { UserComponent } from '../components/user/user.component';
import { LandingPageComponent } from '../components/landing-page/landing-page.component';
import { FeedComponent } from 'src/components/feed/feed.component';

@NgModule({
 imports: [
    BrowserModule
  ],
  declarations: [
    AppComponent,
    PostComponent,
    UserComponent,
    LandingPageComponent,
    FeedComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
