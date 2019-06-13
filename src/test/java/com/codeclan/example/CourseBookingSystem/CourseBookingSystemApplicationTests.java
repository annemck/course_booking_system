package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.bookingRepositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.courseRepositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.customerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCoursesByStarRating() {
		List<Course> results = courseRepository.getCoursesByStarRating(5);
		assertEquals(1, results.size());
	}

	@Test
	public void canGetCustomerByCourse() {
		List<Customer> results = customerRepository.customersByCourse(1L);
		assertEquals(1, results.size());
	}

	@Test
	public void canGetAllCoursesForCustomer() {
		List<Course> results = courseRepository.getAllCoursesForCustomer(1L);
		assertEquals(1, results.size());
	}

	@Test
	public void canGetCustomersByTownAndCourse() {
		List<Customer> results = customerRepository.getCustomersByTownAndCourse(1L, "Glasgow");
		assertEquals(1, results.size());
	}

	@Test
	public void canGetCustomersOverCertainAgeByTownAndCourse() {
		List<Customer> results = customerRepository.getCustomersByCourseAndTownOverAge(2L, "Glasgow", 27);
		assertEquals(1, results.size());
	}

	@Test
	public void canGetCustomerByLowercaseTownAndCourse() {
		List<Customer> results = customerRepository.getCustomersByTownAndCourse(2L, "glasgow");
		assertEquals(1, results.size());
	}
}
