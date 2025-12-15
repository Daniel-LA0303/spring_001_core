package com.spring.example2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configuration
//@ComponentScan("com.spring.example2")  // ← ¡ESTO ES CLAVE!
//@EnableJpaRepositories("com.spring.example2.repository")
public class AppConfig {
	
	/*@Bean
	DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		
		return dataSource;
	}*/

}
