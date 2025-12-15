package com.spring.example2;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.example2.config.AppConfig;
import com.spring.example2.entity.ActorEntity;
import com.spring.example2.service.ActorService;
import com.spring.example2.service.ActorServiceImpl;

@SpringBootApplication
public class Core2Application {

	public static void main(String[] args) {
		SpringApplication.run(Core2Application.class, args);

		/*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Obtener el DataSource
		DataSource dataSource = context.getBean(DataSource.class);

		// Probar la conexión
		try (Connection conn = dataSource.getConnection()) {
			System.out.println("✅ CONEXIÓN EXITOSA a MySQL!");
		} catch (SQLException e) {
			System.out.println("❌ Error de conexión: " + e.getMessage());
		}
		
		
		ActorService actorService = context.getBean(ActorService.class);
        ActorEntity actor = actorService.getActorById(1L);
        System.out.println("Actor: " + actor.getFirstName() + " " + actor.getLastName());*/
		
	}

}
