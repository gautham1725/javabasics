import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieComponent } from './../movie/movie.component' ;
import { AboutComponent } from './../about/about.component' ;
import { TVComponent } from './../tvshows/tv.component' ;
import { HomeComponent } from './../home/home.component' ;
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent , MovieComponent , AboutComponent , TVComponent , HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
