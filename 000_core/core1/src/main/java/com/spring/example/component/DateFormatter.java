package com.spring.example.component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;


/**
 * @Component es un bean generico, las otras anotaciones tiene funciones especificas como
 * service, repository, etc
 * para el caso de component su uso comun es para utilidades o helpers
 */
@Component  // ← "Esta clase es un FORMATADOR"
public class DateFormatter {
	 public String formatDate(LocalDate date) {
	        // Formateo de fechas (utilidad general)
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return date.format(formatter);
	    }
	    
	    // Método adicional para formatear con hora
	    public String formatDateTime(LocalDateTime dateTime) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        return dateTime.format(formatter);
	    }
	    
	    // Método para parsear fechas
	    public LocalDate parseDate(String dateString) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return LocalDate.parse(dateString, formatter);
	    }
}
