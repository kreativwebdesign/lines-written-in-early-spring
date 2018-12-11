package ch.kreativwebdesign.lineswritteninearlyspring.controllers;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Booking;
import ch.kreativwebdesign.lineswritteninearlyspring.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class BookingController {
    @Autowired
    BookingRepository repository;

    @GetMapping("/bookings")
    @ResponseBody
    public List<Booking> get() {
        List<Booking> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @PostMapping("/bookings")
    @ResponseBody
    public Booking post(@Valid @RequestBody Booking booking) {
        return repository.save(booking);
    }

    @DeleteMapping("/bookings/{bookingId}")
    @ResponseBody
    public void post(@PathVariable Long bookingId) {
        repository.deleteById(bookingId);
    }
}
