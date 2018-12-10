package ch.kreativwebdesign.lineswritteninearlyspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long client;
    private String course;
    private Double price;
    private boolean isPayed;

    public Booking() {

    }

    public Booking(Long client, String course, Double price, boolean isPayed) {
        this.client = client;
        this.course = course;
        this.price = price;
        this.isPayed = isPayed;
    }

    public Long getId() {
        return id;
    }

    public Long getClient() {
        return client;
    }

    public String getCourse() {
        return course;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
