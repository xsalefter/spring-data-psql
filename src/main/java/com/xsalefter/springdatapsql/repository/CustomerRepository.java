package com.xsalefter.springdatapsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xsalefter.springdatapsql.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
