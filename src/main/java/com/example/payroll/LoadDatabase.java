package com.example.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//  This is what will happen once the program is run:
//        Spring Boot will run ALL CommandLineRunner beans once the application context is loaded.
//
//        This runner will request a copy of the EmployeeRepository you just created.
//
//        Using it, it will create two entities and store them.
@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Gym", "Shark","player"));
            employeeRepository.save(new Employee("Jimmy", "Choo","dancer"));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED.toString()));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS.toString()));

            orderRepository.findAll().forEach( order -> {
                log.info(("Preload "+ order));
            });
        };

    }
}
