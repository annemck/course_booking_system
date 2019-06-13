package com.codeclan.example.CourseBookingSystem.repositories.courseRepositories;

import com.codeclan.example.CourseBookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesForCustomer(Long id);

}
