import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePlayerComponent } from './components/create-player/create-player.component';
import { PlayerListComponent } from './components/player-list/player-list.component';
import { UpdatePlayerComponent } from './components/update-player/update-player.component';

const routes: Routes = [
  {
    path:'players',
    component:PlayerListComponent
  },
  {
    path:'create-player',
    component:CreatePlayerComponent
  },
  {
    path:'',
    redirectTo:'players',
    pathMatch:'full'
  },
  {
    path:'update-player/:id',
    component:UpdatePlayerComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
