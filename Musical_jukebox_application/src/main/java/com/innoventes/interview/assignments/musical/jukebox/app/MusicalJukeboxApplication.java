package com.innoventes.interview.assignments.musical.jukebox.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.innoventes.interview.assignments.musical.jukebox.app"})
@EnableJpaRepositories(basePackages = {"com.innoventes.interview.assignments.musical.jukebox.app.repository"})
@EntityScan(basePackages = {"com.innoventes.interview.assignments.musical.jukebox.app.model"})
public class MusicalJukeboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicalJukeboxApplication.class, args);
	}

}
