package ch.kreativwebdesign.lineswritteninearlyspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long client;
    private Long course;

    public Booking() {

    }

    public Booking(Long client, Long course) {
        this.client = client;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public Long getClient() {
        return client;
    }

    public Long getCourse() {
        return course;
    }
}
