import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlayerListComponent } from './components/player-list/player-list.component';
import {HttpClientModule} from '@angular/common/http';
import { CreatePlayerComponent } from './components/create-player/create-player.component'
import {FormsModule} from '@angular/forms';
import { UpdatePlayerComponent } from './components/update-player/update-player.component';
import {ConfirmationPopoverModule} from 'angular-confirmation-popover'
@NgModule({
  declarations: [
    AppComponent,
    PlayerListComponent,
    CreatePlayerComponent,
    UpdatePlayerComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ConfirmationPopoverModule.forRoot({
      confirmButtonType: 'danger' 
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
