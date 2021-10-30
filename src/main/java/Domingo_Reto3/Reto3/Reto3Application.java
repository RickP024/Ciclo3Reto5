package Domingo_Reto3.Reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Domingo_Reto3.Reto3.modelos"})

public class Reto3Application {
	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}
}
