package com.cricket.repo;

import org.springframework.stereotype.Repository;

import com.cricket.model.Player;

@Repository
public class PlayerData {
	
	public Player fetchPlayer() {
		//returning dummy data for now
		System.out.println("inside fetchPlayer() dao layer");
		
		Player player = new Player(21, "rahul");
		
		return player;
	}

}
