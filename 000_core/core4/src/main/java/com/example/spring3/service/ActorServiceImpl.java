package com.example.spring3.service;

import org.springframework.stereotype.Service;

import com.example.spring3.entity.ActorEntity;
import com.example.spring3.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService{
	
	private ActorRepository actorRepository;
	
	public ActorServiceImpl(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}

	@Override
	public ActorEntity getActorById(Long id) {
		
		return actorRepository.findById(id).get();
	}
	
	

}
