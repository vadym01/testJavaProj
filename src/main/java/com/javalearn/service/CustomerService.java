package com.javalearn.service;

import com.javalearn.model.Customer;

import java.util.List;
import java.util.PriorityQueue;

public interface CustomerService {
    void addCustomer(Customer customer);

    Customer serveACustomer();

    void deleteCustomerFromQueue(Customer customer);

    void showAllCustomers();

    void addAll(List<Customer> customerList);

    PriorityQueue<Customer> getAllCustomers();


}
