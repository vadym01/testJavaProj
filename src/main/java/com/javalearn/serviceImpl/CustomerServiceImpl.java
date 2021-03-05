package com.javalearn.serviceImpl;

import com.javalearn.model.Customer;
import com.javalearn.service.CustomerService;

import java.util.List;
import java.util.PriorityQueue;

public class CustomerServiceImpl implements CustomerService {

    private final PriorityQueue<Customer> priorityQueue = new PriorityQueue<>();

    @Override
    public void addCustomer(Customer customer) {
        try {
            priorityQueue.add(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Customer serveACustomer() {
        try {
            return priorityQueue.peek();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void deleteCustomerFromQueue(Customer customer) {
        try {
            priorityQueue.remove(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void showAllCustomers() {
        for (Customer customer : priorityQueue) {
            System.out.println(customer);
        }
    }

    @Override
    public void addAll(List<Customer> customerList) {
        try {
            priorityQueue.addAll(customerList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public PriorityQueue<Customer> getAllCustomers() {
        return priorityQueue;
    }
}
