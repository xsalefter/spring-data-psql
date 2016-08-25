package com.xsalefter.springdatapsql.repository;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.xsalefter.springdatapsql.entity.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class CustomerRepositoryDBTest {

	@Inject
	private CustomerRepository customerRepository;

	@Test
	public void whenSave_then_newCustomerAdded() {
		final Customer customer = new Customer();
		customer.setFirstName("john");

		final Customer saved = this.customerRepository.save(customer);
		assertThat(saved, is(notNullValue()));
		assertThat(saved.getId(), is(notNullValue()));
		assertThat(saved.getId() > 0, is(true));
	}
}
