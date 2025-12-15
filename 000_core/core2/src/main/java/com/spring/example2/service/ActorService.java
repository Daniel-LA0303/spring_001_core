package com.spring.example2.service;

import java.util.List;

import com.spring.example2.dto.ActorDTO;
import com.spring.example2.entity.ActorEntity;

public interface ActorService {
	
	public ActorEntity getActorById(Long actorId);
	
	public List<ActorEntity> getActorsByNames(String name);
	
	public ActorEntity getActorByIdNative(Long id);
	
	public ActorDTO getActorSmallInfo(Long id);

}
