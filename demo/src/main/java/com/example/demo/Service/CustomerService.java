package com.example.demo.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id){
        return  customerRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No customer found with ID: " + id));
    }

    public  Customer saveCustomer(Customer customer){
        return  customerRepository.save(customer);
    }

    public  void  deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }



}
