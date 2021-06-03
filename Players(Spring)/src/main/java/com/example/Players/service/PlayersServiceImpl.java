package com.example.Players.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Players.Model.Players;
import com.example.Players.repositry.PlayersRepositry;

@Service
public class PlayersServiceImpl implements PlayersService{

	@Autowired
	
	 private PlayersRepositry playerRepo;
	@Override
	public List<Players> getAll() {
		
		return playerRepo.findAll();
	}
	
	@Override
	public Players save(Players players) {
		return playerRepo.save(players);
			
	}
	
	@Override
	public Optional<Players> getById(long id) {
		
		return playerRepo.findById((long) id);
	}
	
	@Override
	public void update(int id, Players player) {
		playerRepo.save(player);
		
	}

	@Override
	public void deleteById(long id) {
		playerRepo.deleteById(id);

	}


	

}
