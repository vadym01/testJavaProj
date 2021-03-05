package com.javalearn.serviceImpl;

import com.javalearn.model.Customer;
import com.javalearn.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerServiceImplTest {

    CustomerService customerService;
    Customer customer;
    List<Customer> customerList;

    @BeforeEach
    void setUp() {
        customerService = new CustomerServiceImpl();
        customer = new Customer("Dillon", "Shepard", false, 24);
        customerList = Arrays.asList(
                new Customer("Woodrow", "Freeman", false, 90),
                new Customer("Raymond", "Mustafa", true, 33),
                new Customer("Harriett", "Dorsey", true, 90),
                new Customer("Rojin", "Osborne", false, 81),
                new Customer("Abigale", "Leigh", true, 22)
        );
    }

    @Test
    void addCustomer() {
        PriorityQueue<Customer> customerPriorityQueue = customerService.getAllCustomers();
        customerService.addCustomer(customer);
        assertNotNull(customerPriorityQueue);
        assertEquals(customerPriorityQueue.peek(),customer);
    }

    @Test
    void serveACustomer() {
        customerService.addAll(customerList);
        assertEquals(customerService.serveACustomer(),customerList.get(2));
    }

    @Test
    void deleteCustomerFromQueue() {
        customerService.addAll(customerList);
        customerService.deleteCustomerFromQueue(customerList.get(0));
        assertFalse(customerService.getAllCustomers().contains(customerList.get(0)));
    }

    @Test
    void showAllCustomers() {
        customerService.addAll(customerList);
        customerService.showAllCustomers();
    }

    @Test
    void addAll() {
        customerService.addAll(customerList);
        assertEquals(customerService.getAllCustomers().size(),customerList.size());
        assertTrue(customerService.getAllCustomers().contains(customerList.get(0)));
    }

    @Test
    void getAllCustomers() {
        assertNull(customerService.getAllCustomers());
        customerService.addAll(customerList);
        assertTrue(customerService.getAllCustomers().contains(customerList.get(0)));
    }
}