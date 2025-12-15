package com.spring.example2;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example2.dto.ActorDTO;
import com.spring.example2.entity.ActorEntity;
import com.spring.example2.service.ActorService;

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
	
	@GetMapping("/by-name/{name}")
	public List<ActorEntity> getActorsByNames(@PathVariable String name) {
		
		return actorService.getActorsByNames(name);
	}
	
	@GetMapping("/native/{id}")
	public ActorEntity getActorByIdNative(@PathVariable Long id) {
		
		return actorService.getActorByIdNative(id);
	}
	
	@GetMapping("/small-info/{id}")
	public ActorDTO getActorSmallInfo(@PathVariable Long id) {
		
		return actorService.getActorSmallInfo(id);
	}
	

}
