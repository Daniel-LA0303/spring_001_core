package com.spring.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.example.component.DateFormatter;
import com.spring.example.services.MyService;

//@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		// con BeanFacotry más ligero, menos características
		// . Factory hace TODO el trabajo:
		// - Crea Student student = new Student();
		// - Ejecuta student.setName("Ana");
		// - Guarda ambos en su contenedor
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		// without IoC
		// Student student = new Student("Juan", 25);

		// with IoC
		Student student = (Student) factory.getBean("student");
		Student student1 = (Student) factory.getBean("student");

		Student student2 = (Student) factory.getBean("student2");

		System.out.println(student);

		System.out.println(student2);

		System.out.println(student == student1); // misma instancia
		System.out.println(student == student2);

		// ApplicationContext - más características, hereda de BeanFactory
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student studentC = context.getBean("student", Student.class);
		System.out.println("student form context: " + studentC);

		// Contexto de una clase de configuracion
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Student studentC2 = context2.getBean("studentBean", Student.class);
		System.out.println("bean from AppConfig.class -> " + studentC2);

		MyService service = context2.getBean(MyService.class);
		System.out.println("Service 1 -> " + service.Service1());

		System.out.println("Service 1 call Service 2-> " + service.Service2());

		// multiples clases de configuracion en un solo contexto
		/*
		 * ApplicationContext context = new AnnotationConfigApplicationContext(
		 * DatabaseConfig.class, SecurityConfig.class, WebConfig.class );
		 * 
		 * // Puedes acceder a beans de CUALQUIER configuración DataSource ds =
		 * context.getBean(DataSource.class); RestTemplate rt =
		 * context.getBean(RestTemplate.class); ObjectMapper om =
		 * context.getBean(ObjectMapper.class);
		 */

		// toda la configuracion de los beans nos lo ahorra estas lineas
		/*
		 * @SpringBootApplication // ← ¡SOLO ESTA LÍNEA! public class Application {
		 * public static void main(String[] args) {
		 * SpringApplication.run(Application.class, args); // ← ¡Y ESTA! } }
		 */

		// y con esto
		/*
		 * @SpringBootApplication // Equivale a:
		 * 
		 * @SpringBootConfiguration
		 * 
		 * @EnableAutoConfiguration // ← ¡LA MAGIA PRINCIPAL!
		 * 
		 * @ComponentScan("com.tu.paquete.actual") // ← Escaneo automático public class
		 * Application { }
		 */

		// componentes
		DateFormatter formatter = context2.getBean(DateFormatter.class);

		LocalDate hoy = LocalDate.now();
		String fechaFormateada = formatter.formatDate(hoy);

		System.out.println("Fecha formateada: " + fechaFormateada);

		// Probar más formatos
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Fecha y hora: " + formatter.formatDateTime(ahora));

	}

}
