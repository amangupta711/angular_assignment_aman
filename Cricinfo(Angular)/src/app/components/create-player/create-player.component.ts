import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from 'src/app/player';
import { PlayerService } from 'src/app/player.service';

@Component({
  selector: 'app-create-player',
  templateUrl: './create-player.component.html',
  styleUrls: ['./create-player.component.css']
})
export class CreatePlayerComponent implements OnInit {


  player:Player= new Player();
  constructor(private playerService:PlayerService,private router:Router) { }

  ngOnInit(): void {
  }

  savePlayer(){
    this.playerService.createPlayer(this.player).subscribe(
      data=>{
        console.log(data);
        this.goToPlayerList();
      },
      error=>console.log(error)
    )
  }

  goToPlayerList(){
    this.router.navigate(['/players']);

  }

  onSubmit(){
    this.savePlayer();

  }

}
