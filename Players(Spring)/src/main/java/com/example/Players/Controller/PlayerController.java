package com.example.Players.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Players.Model.Players;
import com.example.Players.service.PlayersService;





@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class PlayerController {
	
	@Autowired
	private PlayersService playerService;
	
	
	@GetMapping("/players")
	public List<Players> players() {
		
		return playerService.getAll();
	}
	
	@PostMapping("/players")
	public void addplayers( @RequestBody Players player){
		playerService.save(player);
		
	}
	
	
	@GetMapping("/players/{id}")
	public Optional<Players> getbyid(@PathVariable Integer id) {
		
		return (playerService.getById(id));
	}
	
	@PutMapping("/players/{id}")
	public void updatePlayers(@RequestBody Players player,@PathVariable Integer id) {
		playerService.update(id,player);
	}
	
	@DeleteMapping("/players/{id}")
	public void deletebyid(@PathVariable Integer id) {
		
		playerService.deleteById(id);
	}

}
