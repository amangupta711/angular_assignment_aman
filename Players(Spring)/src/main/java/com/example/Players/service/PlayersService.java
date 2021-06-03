package com.example.Players.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Players.Model.Players;





@Service
public interface PlayersService {
	
	List<Players> getAll();
	Players save(Players players);
	Optional<Players> getById(long id);
	void update(int id, Players player);
	void deleteById(long id);
}
