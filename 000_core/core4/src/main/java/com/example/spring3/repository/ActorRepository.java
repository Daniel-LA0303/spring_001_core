package com.example.spring3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring3.entity.ActorEntity;

public interface ActorRepository extends JpaRepository<ActorEntity, Long>{
	
	

}
