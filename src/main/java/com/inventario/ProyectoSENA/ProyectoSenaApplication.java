package com.inventario.ProyectoSENA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.inventario.ProyectoSENA.Controlador"})
//@EntityScan("com.inventario.ProyectoSENA.Modelo")

public class ProyectoSenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSenaApplication.class, args);
	}

}
