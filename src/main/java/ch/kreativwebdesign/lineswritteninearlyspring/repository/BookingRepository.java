package ch.kreativwebdesign.lineswritteninearlyspring.repository;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}
