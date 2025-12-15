package com.spring.example2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.example2.ActorController;
import com.spring.example2.dto.ActorDTO;
import com.spring.example2.entity.ActorEntity;
import com.spring.example2.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService{
	
	//@Autowired
	private final ActorRepository actorRepository;
	
	public ActorServiceImpl(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}

	@Override
	public ActorEntity getActorById(Long actorId) {
		
		// TODO Auto-generated method stub
		return actorRepository.findById(actorId).get();
	}

	@Override
	public List<ActorEntity> getActorsByNames(String name) {
		
		return actorRepository.findActorByName(name);
	}

	@Override
	public ActorEntity getActorByIdNative(Long id) {
		
		return actorRepository.findActorByIdNative(id);
	}

	@Override
	public ActorDTO getActorSmallInfo(Long id) {
		// TODO Auto-generated method stub
		return actorRepository.findActorSmallInfo(id);
	}

}
