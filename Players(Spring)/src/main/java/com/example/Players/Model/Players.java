package com.example.Players.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Players")
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String fullName;
	private String playerType;
	private long numberMatch;
	private String playerTeam;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	public String getplayerType() {
		return playerType;
	}
	public void setplayerType(String playerType) {
		this.playerType = playerType;
	}
	public long getnumberMatch() {
		return numberMatch;
	}
	public void setnumberMatch(long numberMatch) {
		this.numberMatch = numberMatch;
	}
	public String getplayerTeam() {
		return playerTeam;
	}
	public void setplayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public Players(long id, String fullName, String playerType, long numberMatch, String playerTeam) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.playerType = playerType;
		this.numberMatch = numberMatch;
		this.playerTeam = playerTeam;
	}
	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
