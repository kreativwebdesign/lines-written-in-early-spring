package ch.kreativwebdesign.lineswritteninearlyspring.repository;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Booking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findBookingsByClient(Long client);
}
