package com.spring.example2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.example2.dto.ActorDTO;
import com.spring.example2.entity.ActorEntity;

public interface ActorRepository extends JpaRepository<ActorEntity, Long>{
	
	// 1. JPA metodos automaticos
	ActorEntity findByFirstName(String firstName);
	
	
	// 2. JPQL con @Query
	@Query("select a from ActorEntity a where a.firstName like concat('%',:name,'%')")
	List<ActorEntity> findActorByName(@Param("name") String name);
	

    /* 3 .Query nativo - SELECT simple
     * No requiere mapear la entidad, una vez hecha la conexion conoce las tablas que estan en la db
     * Eso se hace en casos especificos
     */
    @Query(value = "SELECT * FROM actor WHERE actor_id = :id", nativeQuery = true)
    ActorEntity findActorByIdNative(@Param("id") Long id);
    
    /**
     * 4. Query con dto
     */
    @Query("select new com.spring.example2.dto.ActorDTO(a.firstName, a.lastName) " +
     " from ActorEntity a where a.actorId = :id")
    ActorDTO findActorSmallInfo(@Param("id") Long id);
    
}
