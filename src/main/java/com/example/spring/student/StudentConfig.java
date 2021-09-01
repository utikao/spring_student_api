package com.example.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student james = new Student(

                    "James",
                    "Bond",
                    "James@gmail.com",
                    LocalDate.of(2003, Month.MARCH,28)

            );

            Student alex = new Student(

                    "Alex",
                    "White",
                    "Alex@gmail.com",
                    LocalDate.of(2001, Month.MARCH,21)

            );

            repository.saveAll(
                    List.of()
            );

        };
    }
}
