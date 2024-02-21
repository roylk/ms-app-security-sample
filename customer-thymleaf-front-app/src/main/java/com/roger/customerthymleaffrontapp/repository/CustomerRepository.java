package com.roger.customerthymleaffrontapp.repository;

import com.roger.customerthymleaffrontapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
