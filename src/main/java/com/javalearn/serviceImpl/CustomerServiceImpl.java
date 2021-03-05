package com.javalearn.serviceImpl;

import com.javalearn.model.Customer;
import com.javalearn.service.CustomerService;

import java.util.List;
import java.util.PriorityQueue;

public class CustomerServiceImpl implements CustomerService {

    private final PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();

    @Override
    public void addCustomer(Customer customer) {
        priorityQueue.add(customer);
    }

    @Override
    public Customer serveACustomer() {
        return priorityQueue.peek();
    }

    @Override
    public void deleteCustomerFromQueue(Customer customer) {
        priorityQueue.remove(customer);
    }

    @Override
    public void showAllCustomers() {

        for (Customer customer : priorityQueue) {
            System.out.println(customer);
        }
    }

    @Override
    public void addAll(List<Customer> customerList) {
        priorityQueue.addAll(customerList);
    }

    @Override
    public PriorityQueue<Customer> getAllCustomers() {
        return priorityQueue;
    }
}
