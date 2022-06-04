package com.inventario.ProyectoSENA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.inventario.ProyectoSENA.Controlador"})
//@EntityScan("com.inventario.ProyectoSENA.Modelo")

public class ProyectoSenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSenaApplication.class, args);
	}

}
