package com.example.zipkincs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkincsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkincsApplication.class, args);
	}

}
