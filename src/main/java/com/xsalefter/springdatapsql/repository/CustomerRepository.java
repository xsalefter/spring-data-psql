package com.xsalefter.springdatapsql.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.xsalefter.springdatapsql.entity.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {
}
