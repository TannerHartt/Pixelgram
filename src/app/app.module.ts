import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PostComponent } from '../components/post/post.component';
import { Feed2Component } from './feed2/feed2.component';

@NgModule({
 imports: [
    BrowserModule
  ],
  declarations: [
    AppComponent,
    PostComponent,
    Feed2Component
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
