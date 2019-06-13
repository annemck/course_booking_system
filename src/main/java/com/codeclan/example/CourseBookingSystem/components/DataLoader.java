package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.bookingRepositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.courseRepositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Course course1 = new Course("Codeclan", "Glasgow", 5);
        courseRepository.save(course1);

        Course course2 = new Course ("CodeClan2", "Edinburgh", 4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Atyha", "Glasgow", 25);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Anne", "Glasgow", 31);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("31-06-2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-01-1999", course2, customer2);
        bookingRepository.save(booking2);

    }
}
