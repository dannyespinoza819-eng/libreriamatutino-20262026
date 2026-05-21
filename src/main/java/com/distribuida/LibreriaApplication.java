package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {

		System.out.println("HOLA MUNDO DESDE SPRING BOOT!!!....");

		Cliente cliente = new Cliente(
				1
				,"Yaruqui"
				,"Danny"
				,"1753477551"
				,"Espinoza"
				,"0986231979"
				,"dannyespinoza819@gmail.com"

		);

		System.out.println(cliente.toString());

	}




}
