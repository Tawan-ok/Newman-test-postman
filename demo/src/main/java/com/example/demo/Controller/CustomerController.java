package com.example.demo.Controller;

import com.example.demo.Model.Customer;
import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return  customerService.getAllCustomers();
    }
    @GetMapping("{id}")

    public  Customer getCustomerById(@PathVariable Long id){
        return  customerService.getCustomerById(id);
    }

    @PostMapping("/register")
    public  Customer createCustomer(@RequestBody Customer customer){
        return  customerService.saveCustomer(customer);
    }

    @DeleteMapping("{id}")

    public  void  deleterCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }



}
