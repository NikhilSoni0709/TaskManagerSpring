package com.TaskManager.TaskManager.JPA;

import com.TaskManager.TaskManager.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
