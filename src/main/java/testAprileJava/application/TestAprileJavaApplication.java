package testAprileJava.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("testAprileJava.controllers")
@ComponentScan("testAprileJava.service")
@ComponentScan("testAprileJava.security")
public class TestAprileJavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestAprileJavaApplication.class, args);
	}

}
