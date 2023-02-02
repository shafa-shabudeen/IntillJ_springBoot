package com.example.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    default Iterable<Reservation> findReservationByReservationDate(Date date) {
        return findReservationByReservationDate(date);
    }

}



