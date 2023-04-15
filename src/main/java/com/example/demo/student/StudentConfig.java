package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.support.Repositories;



@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student Mehdi = new Student(
				"Mehdi",
				"Mehdi@gmail.com",
				    LocalDate.of(2000, Month.FEBRUARY, 5),
				21
			);
            Student Wael = new Student(
				"Wael",
				"Wael@gmail.com",
				    LocalDate.of(2004, Month.MARCH, 5),
				21
			);
            repository.saveAll(
                List.of(Mehdi,Wael)
            );
        };
    }
}
