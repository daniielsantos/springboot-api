package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student daniel = new Student(
                    "Daniel",
                    "daniielsouzapvh@gmail.com",
                    LocalDate.of(2000, 01,18)
            );
            Student aline = new Student(
                    "Aline",
                    "aline@gmail.com",
                    LocalDate.of(1992, 01,18)
            );

            repository.saveAll(
                    List.of(daniel, aline)
            );
        };
    }

}
