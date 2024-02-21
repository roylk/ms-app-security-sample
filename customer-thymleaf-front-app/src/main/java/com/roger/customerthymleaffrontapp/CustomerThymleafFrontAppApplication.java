package com.roger.customerthymleaffrontapp;

import com.roger.customerthymleaffrontapp.entities.Customer;
import com.roger.customerthymleaffrontapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerThymleafFrontAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerThymleafFrontAppApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("KOUANI").email("crkkamga@gmail.com").build());
			customerRepository.save(Customer.builder().name("FASSEU").email("lyham@gmail.com").build());
			customerRepository.save(Customer.builder().name("KAMDOUM").email("kamdoum@gmail.com").build());

		};
	}

}
