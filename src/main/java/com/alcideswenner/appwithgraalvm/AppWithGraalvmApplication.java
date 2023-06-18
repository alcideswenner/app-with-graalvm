package com.alcideswenner.appwithgraalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class AppWithGraalvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWithGraalvmApplication.class, args);
	}
}
