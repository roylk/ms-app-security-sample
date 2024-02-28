package com.roger.inventorymservice.repositories;

import com.roger.inventorymservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
