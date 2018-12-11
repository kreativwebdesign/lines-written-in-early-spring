package ch.kreativwebdesign.lineswritteninearlyspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long client;
    @NotNull
    @NotBlank
    private String course;
    @NotNull
    @PositiveOrZero
    private Double price;

    public Booking() {

    }

    public Booking(Long client, String course, Double price) {
        this.client = client;
        this.course = course;
        this.price = price;
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
}
