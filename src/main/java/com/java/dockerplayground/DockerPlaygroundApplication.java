package com.java.dockerplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerPlaygroundApplication {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world!!");
		SpringApplication.run(DockerPlaygroundApplication.class, args);
	}

}
