package edu.icet.repository;

import edu.icet.model.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long> {

    List<Bookings> findByUsers_Id(Long userId);

    Optional<Bookings> findBySeats_Id(Long seatId);
}
