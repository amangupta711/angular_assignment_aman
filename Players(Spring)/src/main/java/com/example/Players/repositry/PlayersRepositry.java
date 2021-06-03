package com.example.Players.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Players.Model.Players;

@Repository
public interface PlayersRepositry extends JpaRepository<Players, Long> {

	

}
