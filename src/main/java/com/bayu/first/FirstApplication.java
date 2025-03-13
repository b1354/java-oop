package com.bayu.first;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.bayu.first.model.Mahasiswa;

@SpringBootApplication
@RestController
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		System.out.println(
		"""

		Nama: Bayu Rizki
		NIM: 02032211073
		
		""");
	}

	@GetMapping("/")
	public List<Mahasiswa> home() {
		return List.of(
			new Mahasiswa("02032211073", "Bayu", "Baleendah", "Selfi"),
			new Mahasiswa("02032211073", "Chandra", "Baleendah", "landscape"),
			new Mahasiswa("02032211080", "Imam", "Sukajadi", "Potrait"),
			new Mahasiswa("02032211099", "Satria", "Cianjur", "landscape")
		);
	}
}
