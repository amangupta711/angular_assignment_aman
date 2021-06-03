import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {Player} from 'src/app/player';
import { PlayerService } from 'src/app/player.service';

@Component({
  selector: 'app-player-list',
  templateUrl: './player-list.component.html',
  styleUrls: ['./player-list.component.css']
})
export class PlayerListComponent implements OnInit {

  public popoverTitle: string = 'DELETE';
  public popoverMessage: string = 'Are You sure ?';
  public confirmClicked: boolean = false;
  public cancelClicked: boolean = false;

 players:Player[];



  constructor(private playerService:PlayerService,private router : Router) { }

  ngOnInit(): void {
    this.getPlayers();
  }

  private getPlayers(){
    this.playerService.getPlayersList().subscribe(data=>{
      this.players=data;
    })

  }

  updatePlayer(id:number){
    this.router.navigate(['update-player',id]);

}


deletePlayer(id: number){
  this.playerService.deletePlayer(id).subscribe( data => {
    console.log(data);
    this.getPlayers();
  })
}


}
