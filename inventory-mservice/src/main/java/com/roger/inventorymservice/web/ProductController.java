package com.roger.inventorymservice.web;

import com.roger.inventorymservice.entities.Product;
import com.roger.inventorymservice.repositories.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> productList(){
        return productRepository.findAll();
    }
}
