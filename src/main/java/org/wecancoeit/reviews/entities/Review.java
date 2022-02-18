package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String comment;
    private Double rating;

    @ManyToOne
    private Painting painting;

    public Review(String name, String comment, Double rating) {
        this.name = name;
        this.comment = comment;
        this.rating = rating;
    }

    public Review() {
    }

    public Painting getPainting() {
        return painting;
    }

    public void setPainting(Painting painting) {
        this.painting = painting;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public Double getRating() {
        return rating;
    }
}
