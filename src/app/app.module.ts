import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { PostComponent } from '../components/post/post.component';
import { UserComponent } from '../components/user/user.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@NgModule({
 imports: [
    BrowserModule,
    HttpClientModule
  ],
  declarations: [
    AppComponent,
    PostComponent,
    UserComponent
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
