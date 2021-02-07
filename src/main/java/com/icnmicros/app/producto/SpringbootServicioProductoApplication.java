package com.icnmicros.app.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.icnmicros.app.commons.models.entity"})
public class SpringbootServicioProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProductoApplication.class, args);
	}

}
