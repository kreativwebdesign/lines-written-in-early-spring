package ch.kreativwebdesign.lineswritteninearlyspring.controllers;

import ch.kreativwebdesign.lineswritteninearlyspring.model.Course;
import ch.kreativwebdesign.lineswritteninearlyspring.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CourseController {
    @Autowired
    CourseRepository repository;

    @GetMapping("/courses")
    @ResponseBody
    public List<Course> get() {
        List<Course> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }
}
