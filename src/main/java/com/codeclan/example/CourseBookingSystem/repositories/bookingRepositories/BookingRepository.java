package com.codeclan.example.CourseBookingSystem.repositories.bookingRepositories;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> getBookingByDate(String date);

}
