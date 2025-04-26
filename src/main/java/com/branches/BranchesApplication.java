package com.branches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BranchesApplication {

	public static void main(String[] args) {
		int x=100;
		int y=2000;
		int a=x*y;

		int z = x+y;
		SpringApplication.run(BranchesApplication.class, args);
	}

}
