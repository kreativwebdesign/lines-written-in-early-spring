package ch.kreativwebdesign.lineswritteninearlyspring.controllers;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Booking;
import ch.kreativwebdesign.lineswritteninearlyspring.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ClientBookingController {
    @Autowired
    BookingRepository repository;

    @GetMapping("/clients/{clientId}/bookings")
    @ResponseBody
    public List<Booking> get(@PathVariable Long clientId) {
        return repository.findBookingsByClient(clientId);
    }
}
