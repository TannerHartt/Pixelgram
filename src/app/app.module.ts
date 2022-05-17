import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PostComponent } from './post/post.component';
import { UserComponent } from './user/user.component';

@NgModule({
 imports: [
    BrowserModule
  ],
  declarations: [
    AppComponent,
    PostComponent,
    UserComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
