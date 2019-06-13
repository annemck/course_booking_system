package com.codeclan.example.CourseBookingSystem.repositories.customerRepositories;

import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> customersByCourse(Long id);

    List<Customer> getCustomersByTownAndCourse(Long id, String town);

    List<Customer> getCustomersByCourseAndTownOverAge(Long id, String town, int age);

}
