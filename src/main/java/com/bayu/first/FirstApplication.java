package com.bayu.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		System.out.println(
		"""

		Nama: Bayu Rizki
		NIM: 02032211073
		
		""");
	}
}
