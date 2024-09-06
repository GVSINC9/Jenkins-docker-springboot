package com.gvs.DockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class DockerDemoApplication {


	public static void main(String[] args) {
		System.out.println("************* Hello Docker World **********");
		SpringApplication.run(DockerDemoApplication.class, args);
	}


}
