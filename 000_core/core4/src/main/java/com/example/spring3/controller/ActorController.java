package com.example.spring3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring3.entity.ActorEntity;
import com.example.spring3.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {
	
	private ActorService actorService;
	
	public ActorController(ActorService actorService) {
		this.actorService = actorService;
	}
	
	@GetMapping("/{id}")
	public ActorEntity getActorById(@PathVariable Long id) {
		
		return actorService.getActorById(id);
	}

}
