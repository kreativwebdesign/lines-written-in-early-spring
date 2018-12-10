package ch.kreativwebdesign.lineswritteninearlyspring.controllers;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Client;
import ch.kreativwebdesign.lineswritteninearlyspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class ClientController {
    @Autowired
    ClientRepository repository;

    @GetMapping("/clients")
    @ResponseBody
    public List<Client> get() {
        List<Client> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }
}
