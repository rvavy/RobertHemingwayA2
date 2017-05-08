package com.example;

import com.example.domain.BarRepository;
import com.example.domain.Bar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAssignmentTwoApplication implements CommandLineRunner{

	@Autowired
	private BarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(WebAssignmentTwoApplication.class, args);
	}

	/* Displays the text of the Bars submitted in the repository when the website is run
-------------------------------------------------- */
	@Override
	public void run(String... strings) throws Exception {
		for (int i = 0; i < 5; i++){
			repository.save(new Bar("Bar & Information #" + (i+1)));
		}
	}
}
