package com.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.example") // escanea los paquetes en busca de anotaciones que sean beans (service, repository, component etc)
public class AppConfig {
	
	@Bean
	public Student studentBean() {
		return new Student("bean", "from config");
	}

}
