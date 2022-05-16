import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
      AppComponent
    ],
    imports: [
      BrowserModule,
      HttpClientModule,
      CommonModule,
    ],
    providers: [],
    entryComponents: [AppComponent],
    bootstrap: [AppComponent]
  })
  export class AppModule { }



=======
import { PostComponent } from '../components/post/post.component';
import { UserComponent } from '../components/user/user.component';

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
>>>>>>> develop
