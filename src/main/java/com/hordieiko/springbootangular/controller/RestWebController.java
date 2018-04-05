package com.hordieiko.springbootangular.controller;

import com.hordieiko.springbootangular.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vhordieiko on 4/4/2018.
 */

@RestController
public class RestWebController {

    List<Customer> customers = new ArrayList<Customer>();

    @RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
    public List<Customer> getResource() {
        return customers;
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return "Successful!";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }

}
