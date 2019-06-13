package com.codeclan.example.CourseBookingSystem.controllers;

import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courses/{id}")
    public List<Customer> getCustomersByCourse(@PathVariable Long id){
        return customerRepository.customersByCourse(id);
    }

    @GetMapping(value = "/courses/{id}/town/{town}")
    public List<Customer> getCustomerByCourseAndTown(@PathVariable Long id, @PathVariable String town){
        return customerRepository.getCustomersByTownAndCourse(id, town);
    }

    @GetMapping(value = "/courses/{id}/town/{town}/age/{age}")
    public List<Customer> getCustomerOverAgeByCourseAndTown(@PathVariable Long id,
                                                            @PathVariable String town,
                                                            @PathVariable int age){
        return customerRepository.getCustomersByCourseAndTownOverAge(id, town, age);
    }

}
