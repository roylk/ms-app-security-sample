package com.roger.inventorymservice;

import com.roger.inventorymservice.entities.Product;
import com.roger.inventorymservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryMserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryMserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("LAPTOP").price(467).quantity(3).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("PRINTER").price(205).quantity(1).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("KEYBOARD").price(104).quantity(2).build());

        };
    }

}
