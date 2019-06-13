package com.codeclan.example.CourseBookingSystem.repositories.courseRepositories;

import com.codeclan.example.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getCoursesByStarRating(int rating);

}
