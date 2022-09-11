package com.patika.patika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
@SpringBootApplication
public class PatikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatikaApplication.class, args);
	
	}
}
