package com.cricket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.model.Player;
import com.cricket.repo.PlayerData;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerData playerData;
	
	@GetMapping("/fetchPlayer")
	public Player fetchPlayer() {
		
		System.out.println("inside fetchPlayer() controller");
		System.out.println("player fetched : " + playerData.fetchPlayer());
		
		return playerData.fetchPlayer();
	}
	
	@PostMapping("/addPlayer")
	public Player addPlayer(@RequestBody Player player) {
		
		System.out.println("inside addPlayer() controller");
		System.out.println("player added : " + player);
		
		return player;
	}

}
