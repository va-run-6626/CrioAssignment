package com.Varun.Assignment.service;

import com.Varun.Assignment.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(Long id);
    public Customer saveCustomer(Customer customer);
    public void deleteCustomer(Long id);
}
